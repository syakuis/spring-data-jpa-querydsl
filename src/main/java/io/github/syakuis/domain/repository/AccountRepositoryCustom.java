package io.github.syakuis.domain.repository;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
public interface AccountRepositoryCustom {
    boolean existsByName(String name);
}
