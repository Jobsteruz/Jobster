//package com.smartbox.jobster.excel;
//
//import com.smartbox.jobster.$;
//import com.smartbox.jobster.entity.ats.Priority;
//import com.smartbox.jobster.entity.core.Person;
//import com.smartbox.jobster.entity.core.PersonStatus;
//import com.smartbox.jobster.entity.hrm.RequestStatus;
//import com.smartbox.jobster.entity.hrm.VacancyStatus;
//import com.vaadin.flow.component.grid.Grid;
//import com.vaadin.flow.component.treegrid.TreeGrid;
//import com.vaadin.flow.data.provider.hierarchy.HierarchicalDataProvider;
//import io.jmix.core.DateTimeTransformations;
//import io.jmix.core.Id;
//import io.jmix.core.common.util.Preconditions;
//import io.jmix.core.metamodel.model.MetaPropertyPath;
//import io.jmix.core.security.CurrentAuthentication;
//import io.jmix.flowui.Notifications;
//import io.jmix.flowui.component.ListDataComponent;
//import io.jmix.flowui.component.grid.DataGrid;
//import io.jmix.flowui.component.grid.EnhancedDataGrid;
//import io.jmix.flowui.component.grid.TreeDataGrid;
//import io.jmix.flowui.data.ContainerDataUnit;
//import io.jmix.flowui.data.grid.ContainerDataGridItems;
//import io.jmix.flowui.data.grid.ContainerTreeDataGridItems;
//import io.jmix.flowui.download.ByteArrayDownloadDataProvider;
//import io.jmix.flowui.download.Downloader;
//import io.jmix.gridexportflowui.GridExportProperties;
//import io.jmix.gridexportflowui.exporter.ExportMode;
//import io.jmix.gridexportflowui.exporter.entitiesloader.AllEntitiesLoader;
//import io.jmix.gridexportflowui.exporter.entitiesloader.AllEntitiesLoaderFactory;
//import io.jmix.gridexportflowui.exporter.excel.ExcelAutoColumnSizer;
//import io.jmix.gridexportflowui.exporter.excel.ExcelExporter;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFRichTextString;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.util.*;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//import static io.jmix.flowui.download.DownloadFormat.XLSX;
//
//@Primary
//@Component("grdexp_CustomExcelExporter")
//public class CustomExcelExporter extends ExcelExporter {
//    private static final Map<String, Short> STATUS_COLOR_MAP = new HashMap<>();
//
//    static {
//        STATUS_COLOR_MAP.put("#006AF5", IndexedColors.BLUE.getIndex());
//        STATUS_COLOR_MAP.put("#0D0D0D", IndexedColors.BLACK.getIndex());
//        STATUS_COLOR_MAP.put("#E21D12", IndexedColors.RED.getIndex());
//        STATUS_COLOR_MAP.put("#158444", IndexedColors.GREEN.getIndex());
//        STATUS_COLOR_MAP.put("#FF8949", IndexedColors.LIGHT_ORANGE.getIndex());
//        STATUS_COLOR_MAP.put("#EE797F", IndexedColors.ROSE.getIndex());
//        STATUS_COLOR_MAP.put("#FD3435", IndexedColors.CORAL.getIndex());
//        STATUS_COLOR_MAP.put("#FDC202", IndexedColors.GOLD.getIndex());
//        STATUS_COLOR_MAP.put("#239432", IndexedColors.LIME.getIndex());
//    }
//
//    public CustomExcelExporter(GridExportProperties gridExportProperties,
//                               Notifications notifications,
//                               AllEntitiesLoaderFactory allEntitiesLoaderFactory,
//                               CurrentAuthentication currentAuthentication,
//                               DateTimeTransformations dateTimeTransformations) {
//        super(gridExportProperties,
//                notifications,
//                allEntitiesLoaderFactory,
//                currentAuthentication,
//                dateTimeTransformations);
//    }
//
//    @Override
//    public void exportDataGrid(Downloader downloader,
//                               Grid<Object> dataGrid,
//                               ExportMode exportMode) {
//        super.exportDataGrid(downloader, dataGrid, exportMode);
//    }
//
//    @Override
//    public void exportDataGrid(Downloader downloader,
//                               Grid<Object> dataGrid,
//                               ExportMode exportMode,
//                               Predicate<Grid.Column<Object>> columnFilter) {
//        Preconditions.checkNotNullArgument(downloader, "Downloader is null");
//
//        createWorkbookWithSheet();
//        try {
//            createFonts();
//            createFormats();
//
//            boolean isPersonClass = false;
//            try {
//                if (dataGrid.getDataProvider() instanceof ContainerDataUnit<?> unit)
//                    isPersonClass = Person.class.isAssignableFrom(unit.getContainer().getEntityMetaClass().getJavaClass());
//            } catch (Exception ignored) {
//            }
//
//            Predicate<Grid.Column<Object>> excludeCertainColumns = column -> {
//                String key = column.getKey();
//                return !"firstName".equals(key);
//            };
//
//            List<Grid.Column<Object>> columns = dataGrid.getColumns().stream()
//                    .filter(isPersonClass ? excludeCertainColumns : columnFilter)
//                    .toList();
//
//            int r = 0;
//
//            Row row = sheet.createRow(r);
//            createAutoColumnSizers(columns.size());
//
//            float maxHeight = sheet.getDefaultRowHeightInPoints();
//            // CellStyle headerCellStyle = headerRowStyle();
//
//            for (DataGrid.Column<?> column : columns) {
//                String columnHeaderText = getColumnHeaderText(column);
//
//                int countOfReturnSymbols = StringUtils.countMatches(columnHeaderText, "\n");
//                if (countOfReturnSymbols > 0) {
//                    maxHeight = Math.max(maxHeight, (countOfReturnSymbols + 1) * sheet.getDefaultRowHeightInPoints());
//                    // headerCellStyle.setWrapText(true);
//                }
//            }
//            row.setHeightInPoints(maxHeight);
//
//            for (int c = 0; c < columns.size(); c++) {
//                DataGrid.Column<?> column = columns.get(c);
//                String columnHeaderText = getColumnHeaderText(column);
//                Cell cell = row.createCell(c);
//                RichTextString richTextString = new XSSFRichTextString(columnHeaderText);
//                richTextString.applyFont(boldFont);
//                cell.setCellValue(richTextString);
//
//                ExcelAutoColumnSizer sizer = new ExcelAutoColumnSizer();
//                sizer.notifyCellValue(columnHeaderText, boldFont);
//                sizers[c] = sizer;
//
//                // cell.setCellStyle(headerCellStyle);
//            }
//
//            ContainerDataGridItems<Object> dataGridSource = (ContainerDataGridItems) ((ListDataComponent<Object>) dataGrid).getItems();
//            if (dataGridSource == null) {
//                throw new IllegalStateException("DataGrid is not bound to data");
//            }
//
//            if (exportMode == ExportMode.SELECTED_ROWS && !dataGrid.getSelectedItems().isEmpty()) {
//                Set<Object> selected = dataGrid.getSelectedItems();
//                List<Object> ordered = dataGridSource.getContainer().getItems().stream()
//                        .filter(selected::contains)
//                        .toList();
//
//                for (Object item : ordered) {
//                    if (checkIsRowNumberExceed(r)) {
//                        break;
//                    }
//
//                    createDataGridRow(dataGrid, columns, 0, ++r, Id.of(item).getValue());
//                }
//
//            } else if (exportMode == ExportMode.CURRENT_PAGE) {
//                if (dataGrid instanceof TreeDataGrid treeDataGrid
//                        && dataGridSource instanceof ContainerTreeDataGridItems containerTreeDataGridItems) {
//
//                    // only top level items
//                    List<Object> items = containerTreeDataGridItems.getContainer().getItems().stream()
//                            .filter(entity -> containerTreeDataGridItems.getLevel(entity) == 0)
//                            .toList();
//
//                    for (Object item : items) {
//                        if (checkIsRowNumberExceed(r)) {
//                            break;
//                        }
//
//                        r = createDataGridHierarchicalRow(treeDataGrid, ((ContainerTreeDataGridItems) dataGridSource),
//                                columns, 0, r, item);
//                    }
//                } else {
//                    for (Object itemId : dataGridSource.getContainer().getItems().stream()
//                            .map(entity -> Id.of(entity).getValue())
//                            .collect(Collectors.toList())
//                    ) {
//                        if (checkIsRowNumberExceed(r)) {
//                            break;
//                        }
//
//                        createDataGridRow(dataGrid, columns, 0, ++r, itemId);
//                    }
//                }
//
//            } else if (exportMode == ExportMode.ALL_ROWS) {
//                boolean addLevelPadding = !(dataGrid instanceof TreeDataGrid);
//
//                AllEntitiesLoader entitiesLoader = allEntitiesLoaderFactory.getEntitiesLoader();
//                entitiesLoader.loadAll(
//                        ((ListDataComponent<?>) dataGrid).getItems(),
//                        context -> {
//                            if (!checkIsRowNumberExceed(context.getEntityNumber())) {
//                                createDataGridRowForEntityInstance(
//                                        dataGrid,
//                                        columns,
//                                        0,
//                                        context.getEntityNumber(),
//                                        context.getEntity(),
//                                        addLevelPadding);
//                                return true;
//                            }
//                            return false;
//                        });
//            }
//
//            for (int c = 0; c < columns.size(); c++) {
//                sheet.setColumnWidth(c, sizers[c].getWidth() * COL_WIDTH_MAGIC);
//            }
//
//            ByteArrayOutputStream out = new ByteArrayOutputStream();
//            try {
//                wb.write(out);
//            } catch (IOException e) {
//                throw new RuntimeException("Unable to write document", e);
//            }
//
//            if (isXlsxMaxRowNumberExceeded()) {
//                showWarnNotification();
//            }
//
//            ByteArrayDownloadDataProvider dataProvider = new ByteArrayDownloadDataProvider(out.toByteArray(),
//                    uiProperties.getSaveExportedByteArrayDataThresholdBytes(), coreProperties.getTempDir());
//
//            downloader.download(dataProvider, getFileName(dataGrid) + "." + XLSX.getFileExt(), XLSX);
//
//        } finally {
//            disposeWorkBook();
//        }
//    }
//
////    @Override
////    public void setApplicationContext(ApplicationContext applicationContext) {
////        super.setApplicationContext(applicationContext);
////
////        // Set up a predicate to exclude firstName and phone columns
////        Predicate<Grid.Column<Object>> excludeCertainColumns = column -> {
////            String key = column.getKey();
////            return !"firstName".equals(key) && !"phone".equals(key);
////        };
////
////        // Set the column filter for the exporter
////        withColumnsExportFilter(excludeCertainColumns);
////    }
//
//    @Override
//    protected void createDataGridRow(Grid<?> dataGrid, List<Grid.Column<Object>> columns, int startColumn, int rowNumber, Object itemId) {
//        Object entityInstance = ((ContainerDataGridItems) ((ListDataComponent) dataGrid).getItems()).getItem(itemId);
//        createDataGridRowForEntityInstance(dataGrid, columns, startColumn, rowNumber, entityInstance, true);
//    }
//
//    @Override
//    protected int createDataGridHierarchicalRow(TreeGrid<?> dataGrid, ContainerTreeDataGridItems<Object> treeDataGridItems, List<Grid.Column<Object>> columns, int startColumn, int rowNumber, Object item) {
//        if (!checkIsRowNumberExceed(rowNumber)) {
//            createDataGridRow(dataGrid, columns, startColumn, ++rowNumber, Id.of(item).getValue());
//
//            Collection<Object> children = treeDataGridItems.getChildren(item).toList();
//            for (Object child : children) {
//                rowNumber = createDataGridHierarchicalRow(dataGrid, treeDataGridItems, columns, startColumn, rowNumber, child);
//            }
//        }
//        return rowNumber;
//    }
//
//    @Override
//    protected void createDataGridRowForEntityInstance(Grid<?> dataGrid, List<Grid.Column<Object>> columns, int startColumn, int rowNumber, Object entityInstance, boolean addLevelPadding) {
//        if (startColumn >= columns.size()) {
//            return;
//        }
//        Row row = sheet.createRow(rowNumber);
//
//        int level = 0;
//        if (addLevelPadding && dataGrid instanceof TreeDataGrid) {
//            HierarchicalDataProvider dataProvider = ((TreeDataGrid<Object>) dataGrid).getDataProvider();
//            level = ((ContainerTreeDataGridItems) dataProvider).getLevel(entityInstance);
//        }
//
//
//        for (int c = startColumn; c < columns.size(); c++) {
//            Cell cell = row.createCell(c);
//            DataGrid.Column<?> column = columns.get(c);
//            MetaPropertyPath propertyPath = ((EnhancedDataGrid) dataGrid).getColumnMetaPropertyPath(column);
//            Object cellValue = getColumnValue(dataGrid, columns.get(c), entityInstance);
//            // clear html if exists
//            if (Objects.nonNull(cellValue) && $.hasHtmlTag(cellValue.toString())) {
//                cellValue = $.clearHtml(cellValue.toString());
//            }
//
//            if (cellValue instanceof Enum<?>) {
//                CellStyle cellStyle = wb.createCellStyle();
//                Font font = wb.createFont();
//                font.setFontHeightInPoints((short) 10);
//
//                if (cellValue instanceof PersonStatus status) font.setColor(STATUS_COLOR_MAP.get(status.getColor()));
//                else if (cellValue instanceof VacancyStatus status)
//                    font.setColor(STATUS_COLOR_MAP.get(status.getColor()));
//                else if (cellValue instanceof RequestStatus status)
//                    font.setColor(STATUS_COLOR_MAP.get(status.getColor()));
//                else if (cellValue instanceof Priority status) font.setColor(STATUS_COLOR_MAP.get(status.getColor()));
//
//
//                cellStyle.setFont(font);
//                cell.setCellStyle(cellStyle);
//            }
//
//            formatValueCell(cell, cellValue, propertyPath, c, rowNumber, level, null);
//        }
//    }
//
////    private CellStyle headerRowStyle() {
////        return createCellStyle(223, 223, 226);
////    }
////
////    private CellStyle evenRowStyle() {
////        return createCellStyle(254, 254, 254);
////    }
////
////    private CellStyle oddRowStyle() {
////        return createCellStyle(238, 244, 244);
////    }
////
////    private CellStyle createCellStyle(int R, int G, int B) {
////        CellStyle cellStyle = wb.createCellStyle();
////        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
////        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
////        if (wb instanceof SXSSFWorkbook sxssfWorkbook) {
////            XSSFWorkbook underlyingWorkbook = sxssfWorkbook.getXSSFWorkbook();
////            XSSFColor whiteColor = new XSSFColor(new java.awt.Color(R, G, B), underlyingWorkbook.getStylesSource().getIndexedColors());
////            ((XSSFCellStyle) cellStyle).setFillForegroundColor(whiteColor);
////        } else cellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
////
////        return cellStyle;
////    }
//}
