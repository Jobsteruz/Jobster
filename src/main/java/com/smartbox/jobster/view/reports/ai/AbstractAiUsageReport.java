package com.smartbox.jobster.view.reports.ai;

import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import io.jmix.chartsflowui.component.Chart;
import io.jmix.core.entity.KeyValueEntity;

import java.util.List;
import java.util.Locale;

/**
 * Shared base class for all AI Usage report views.
 * Provides common KeyValueEntity extraction helpers, JSON escaping,
 * and reusable chart builder methods for setNativeJson().
 */
public abstract class AbstractAiUsageReport extends AbstractHasPeriodReport {

    protected static final String[] COLORS = {
            "#3699FF", "#47BE7D", "#7239EA", "#FF9500", "#F1416C", "#50CD89", "#009EF7"
    };

    // ─── Value extractors ─────────────────────────────────────────────

    protected String strVal(KeyValueEntity kv, String prop, String def) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected long longVal(KeyValueEntity kv, String prop) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected double dblVal(KeyValueEntity kv, String prop) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ─── JSON helpers ─────────────────────────────────────────────────

    /**
     * Escapes a string value for safe embedding in JSON.
     */
    protected String jsonEscape(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Locale-safe double format for JSON (always uses '.' as decimal separator).
     */
    protected String fmt(String pattern, Object... args) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ─── Chart builders ───────────────────────────────────────────────

    /**
     * Builds a simple bar chart JSON with a single series and uniform color.
     * Data values are extracted as long (integer) values.
     */
    protected String buildBarChartJson(List<KeyValueEntity> data,
                                       String categoryProp, String categoryDefault,
                                       String valueProp, String seriesName, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Builds a bar chart JSON with a single series and uniform color.
     * Data values are extracted as double and formatted with the given format pattern.
     */
    protected String buildBarChartDoubleJson(List<KeyValueEntity> data,
                                             String categoryProp, String categoryDefault,
                                             String valueProp, String seriesName, String color,
                                             String valueFormat) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Builds a bar chart where each bar has a different color (from COLORS palette).
     * Useful for cost-by-feature or similar charts where categories need visual distinction.
     */
    protected String buildColoredBarChartJson(List<KeyValueEntity> data,
                                              String categoryProp, String categoryDefault,
                                              String valueProp, String seriesName,
                                              String valueFormat) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Builds a stacked bar chart JSON with multiple series (e.g., input/output/thought tokens).
     */
    protected String buildStackedBarChartJson(List<KeyValueEntity> data,
                                              String categoryProp, String categoryDefault,
                                              String[][] seriesDefs) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Builds a pie/donut chart JSON from data with per-item colors from COLORS palette.
     */
    protected String buildPieChartJson(List<KeyValueEntity> data,
                                       String nameProp, String nameDefault,
                                       String valueProp, String valueFormat) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Builds a success rate bar chart from data containing total and successCount columns.
     * Calculates percentage in-place.
     */
    protected void loadSuccessRateChart(Chart chart, List<KeyValueEntity> data,
                                        String categoryProp, String categoryDefault,
                                        String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
