package com.basketclub.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Builder
    public Player(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void update(Player edit) {
        this.name = edit.name;
        this.email = edit.email;
        this.password = edit.password;
    }

    public boolean isMatchPassword(String password) {
        return this.password.equals(password);
    }
}
