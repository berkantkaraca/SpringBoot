package com.beanscopes.beanscopes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
@AllArgsConstructor
public class PersonRequest {

    private String id;
    private String Name;

    public PersonRequest() {
        this. id = UUID. randomUUID().toString();
    }

    //request: her istekte yeniden nesne oluşturur. Aynı istek içerisindeki isteklere aynı nesneler verilir. .Burada proxyMode belirlenmelidir yoksa hata verir.
}
