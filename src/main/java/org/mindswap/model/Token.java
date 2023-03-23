package org.mindswap.model;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue
    public Integer id;

    @Column(unique = true)
    public String token;

    @Enumerated(EnumType.STRING)
    public TokenType tokenType = TokenType.BEARER;

    public boolean revoked;
    public boolean expired;

    @Column(name = "user_email")
    public String email;
}