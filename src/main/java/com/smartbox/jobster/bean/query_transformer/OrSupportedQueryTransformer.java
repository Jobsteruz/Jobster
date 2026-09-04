package com.smartbox.jobster.bean.query_transformer;

import io.jmix.core.Sort;

import java.util.Map;
import java.util.Set;

/**
 * @author Jobster team
 * date: 31/07/24 17:30
 */
public interface OrSupportedQueryTransformer {

    void addWhereWithOr(String where);

    /**
     * Main entity alias placeholder
     */
    String ALIAS_PLACEHOLDER = "{E}";

    /**
     * Adds 'where' clause replacing entity alias
     */
    void addWhere(String where);

    /**
     * Adds 'where' clause
     */
    void addWhereAsIs(String where);

    /**
     * Adds 'join' and 'where' clauses. Replaces alias in 'join' but doesn't replace it in 'where'
     */
    void addJoinAndWhere(String join, String where);

    /**
     * Adds or replaces 'order by' clause
     */
    void replaceOrderByExpressions(Map<String, Sort.Direction> sortExpressions);

    /* Adds 'selection' to from clause. It will be inserted as first selection after FROM keyword*/
    void addFirstSelectionSource(String selection);

    /**
     * Replaces <code>select e.f1, e.f2, ...</code> clause with <code>select count(e) ...</code>
     */
    void replaceWithCount();

    /**
     * Replaces <code>select e from ...</code> clause with <code>select e.pkName from ...</code>
     */
    void replaceWithSelectId(String pkName);

    /**
     * Replaces <code>select e from ...</code> clause with <code>select 'selectEntityVariable' from ...</code>
     */
    void replaceWithSelectEntityVariable(String selectEntityVariable);

    /**
     * Replaces 'select distinct' with 'select'.
     *
     * @return true if 'distinct' was really removed, false if there was no 'distinct' in the query
     */
    boolean removeDistinct();

    /**
     * Replaces 'select' with 'select distinct'.
     */
    void addDistinct();

    /**
     * Adds 'order by' clause if it doesn't exists
     */
    void addOrderByIdIfNotExists(String idProperty);

    /**
     * Adds @param entityAlias to 'group by' clause
     */
    void addEntityInGroupBy(String entityAlias);

    /**
     * Removes 'order by' clause
     */
    void removeOrderBy();

    /**
     * Replace main entity name, e.g. "select d ref$Driver d" with "select d ref$ExtDriver d"
     */
    void replaceEntityName(String newName);

    /**
     * Reset internal buffer
     */
    void reset();

    /**
     * Get buffer
     */
    String getResult();

    /**
     * Get parameter names found during transformation
     */
    Set<String> getAddedParams();

    void handleCaseInsensitiveParam(String paramName);

    void replaceInCondition(String paramName);

    /**
     * Adds 'join' clause
     */
    default void addJoin(String join) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Replace all {@code is null} and {@code is not null} statements with provided parameter
     *
     * @param paramName   name of the parameter
     * @param isNullValue is parameter value null
     * @return {@code true} if at least one statement was replaced, {@code false} otherwise
     */
    default boolean replaceIsNullStatements(String paramName, boolean isNullValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
