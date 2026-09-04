package com.smartbox.jobster.bean.query_transformer;

import io.jmix.data.impl.jpql.QueryTree;
import io.jmix.data.impl.jpql.antlr2.JPA2Lexer;
import io.jmix.data.impl.jpql.transform.QueryTreeTransformer;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

import static io.jmix.data.impl.jpql.JPATreeNodes.createLPAREN;
import static io.jmix.data.impl.jpql.JPATreeNodes.createRPAREN;

/**
 * @author Jobster team
 * date: 31/07/24 18:35
 */
public class JbQueryTreeTransformer extends QueryTreeTransformer {
    public JbQueryTreeTransformer(QueryTree queryTree) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void mixinWhereConditionsIntoTreeWithOr(CommonTree targetWhere) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Tree createOr() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
