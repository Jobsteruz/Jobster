package com.smartbox.jobster.bean;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.exceptions.JobsterQueryTransformerException;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import org.intellij.lang.annotations.Language;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * QueryTransformer with the ability to transform SubQueries
 * <br>
 * Version: BETA
 */
public class JobsterQueryTransformer {

    private Map<Integer, Map<Integer, Integer>> subQueryIndexes;

    @Language("JPAQL")
    private String defaultQuery;

    private final QueryTransformerFactory queryTransformerFactory = AppBeans.get(QueryTransformerFactory.class);

    public JobsterQueryTransformer(@Language("JPAQL") String query) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setQuery(String query) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getResult() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addWhere(String where) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param order starts from 1
     */
    public void addWhereToSubquery(String where, int order) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param order starts from 1
     * @return Subquery
     */
    public String getSubqueryByOrder(int order) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getSubquerySize() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<Integer, Integer> setUpSubQueryIndexes(String query, int fromIndex) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void checkQuery() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
