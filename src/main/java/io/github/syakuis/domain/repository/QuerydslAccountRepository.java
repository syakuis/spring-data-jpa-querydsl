package io.github.syakuis.domain.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import io.github.syakuis.domain.entity.AccountEntity;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import static io.github.syakuis.domain.entity.QAccountEntity.accountEntity;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
@Repository
public class QuerydslAccountRepository extends QuerydslRepositorySupport {
    private final JPAQueryFactory jpaQueryFactory;

    public QuerydslAccountRepository(JPAQueryFactory jpaQueryFactory) {
        super(AccountEntity.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public boolean existsByName(String name) {
        return jpaQueryFactory.selectFrom(accountEntity).where(accountEntity.name.eq(name)).limit(1).fetchCount() > 0;
    }
}
