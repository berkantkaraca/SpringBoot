package com.beanscopes.beanscopes;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java. util. UUID;

@Component
@Scope("singleton")
@Getter
@Setter
@AllArgsConstructor
public class PersonSingleton {

    private String id;
    private String Name;

    public PersonSingleton() {
        this. id = UUID. randomUUID().toString();
    }

    //Singleton: her istekte aynı id döner, defaulttur.
    //71d3fce6-0a27-470a-b43c-e4f992f9ea42
}
