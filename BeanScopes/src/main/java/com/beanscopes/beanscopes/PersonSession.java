package com.beanscopes.beanscopes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
@AllArgsConstructor
public class PersonSession {

    private String id;
    private String Name;

    public PersonSession() {
        this. id = UUID. randomUUID().toString();
    }

    //session: nesneyi session bazlı üretir. Aynı tarayıcı farklı sekmeden atsan da aynı nesne gelir. Sadece farklı tarayıcıdan istek atarsa farklı bir nesne üretilir.Burada proxyMode belirlenmelidir yoksa hata verir.
}
