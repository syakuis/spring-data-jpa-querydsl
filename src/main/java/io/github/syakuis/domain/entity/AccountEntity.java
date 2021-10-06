package io.github.syakuis.domain.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Seok Kyun. Choi.
 * @since 2021-10-06
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Builder
    public AccountEntity(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AccountEntity that = (AccountEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
