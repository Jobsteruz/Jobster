package com.smartbox.jobster.bean.query_transformer;

import io.jmix.data.impl.jpql.DomainModel;
import io.jmix.data.impl.jpql.DomainModelBuilder;
import org.intellij.lang.annotations.Language;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * date: 31/07/24 19:18
 */
@Component("jb_QueryTransformerFactory")
public class JbQueryTransformerFactory {

    protected volatile DomainModel domainModel;

    @Autowired
    protected BeanFactory beanFactory;

    @Autowired
    @Qualifier("regular")
    protected DomainModelBuilder domainModelBuilder;

    public OrSupportedQueryTransformer transformer(@Language("JPAQL") String query) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
