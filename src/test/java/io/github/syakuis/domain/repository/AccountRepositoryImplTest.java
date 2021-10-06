package io.github.syakuis.domain.repository;

import io.github.syakuis.config.QuerydslConfiguration;
import io.github.syakuis.domain.entity.AccountEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
@Import(QuerydslConfiguration.class)
class AccountRepositoryImplTest {
    @Autowired
    private AccountRepository accountRepository;

    @BeforeEach
    void init() {
        accountRepository.save(AccountEntity.builder().name("bound").build());
    }

    @Test
    void existsByUsername() {
        assertTrue(accountRepository.existsByName("bound"));
        assertFalse(accountRepository.existsByName("sand"));
    }
}