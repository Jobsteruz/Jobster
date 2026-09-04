//package com.smartbox.jobster.excel;
//
//import com.vaadin.flow.component.icon.VaadinIcon;
//import io.jmix.flowui.action.ActionType;
//import io.jmix.flowui.kit.component.ComponentUtils;
//import io.jmix.gridexportflowui.action.ExcelExportAction;
//import org.springframework.context.ApplicationContext;
//
//@ActionType(CustomExcelExportAction.ID)
//public class CustomExcelExportAction extends ExcelExportAction {
//    public static final String ID = "grdexp_customExcelExport";
//
//    public CustomExcelExportAction() {
//        this(ID);
//    }
//
//    public CustomExcelExportAction(String id) {
//        super(id);
//    }
//
//    @Override
//    protected void initAction() {
//        icon = ComponentUtils.convertToIcon(VaadinIcon.FILE_TABLE);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) {
//        super.setApplicationContext(applicationContext);
//        withExporter(CustomExcelExporter.class);
//    }
//}
