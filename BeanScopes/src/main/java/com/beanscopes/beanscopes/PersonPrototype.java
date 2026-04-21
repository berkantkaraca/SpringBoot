package com.beanscopes.beanscopes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
@Getter
@Setter
@AllArgsConstructor
public class PersonPrototype {

    private String id;
    private String Name;

    public PersonPrototype() {
        this. id = UUID. randomUUID().toString();
    }

    //Prototype: her requestte yeni nesne oluşur. Burada scope belirlesen dahi kullanılıdğı yerde ApplicationContext veya ObjectProvider üzerinden çağrılmalıdır.
}
