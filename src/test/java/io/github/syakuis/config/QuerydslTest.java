package io.github.syakuis.config;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@DataJpaTest
@Import(QuerydslConfiguration.class)
public @interface QuerydslTest {
}