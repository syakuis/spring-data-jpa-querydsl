package io.github.syakuis.domain.repository;

import io.github.syakuis.domain.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
public interface AccountRepository extends JpaRepository<AccountEntity, Long>, AccountRepositoryCustom {
}
