package io.github.syakuis.domain.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static io.github.syakuis.domain.entity.QAccountEntity.accountEntity;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public boolean existsByName(String name) {
        return jpaQueryFactory.selectFrom(accountEntity).where(accountEntity.name.eq(name)).limit(1).fetchCount() > 0;
    }
}
