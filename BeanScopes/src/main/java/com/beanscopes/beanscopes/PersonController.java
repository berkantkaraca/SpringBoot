package com.beanscopes.beanscopes;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind. annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonSingleton personSingleton;
    private final ApplicationContext applicationContext;
    private final ObjectProvider<PersonPrototype> personPrototype;
    private final PersonRequest personRequest;
    private final PersonRequest personRequest2;
    private final PersonSession personSession;

    public PersonController(
            PersonSingleton personSingleton,
            ApplicationContext applicationContext,
            ObjectProvider<PersonPrototype> personPrototype,
            PersonRequest personRequest,
            PersonRequest personRequest2,
            PersonSession personSession
    ) {
        this.personSingleton = personSingleton;
        this.applicationContext = applicationContext;
        this.personPrototype = personPrototype;
        this.personRequest = personRequest;
        this.personRequest2 = personRequest2;
        this.personSession = personSession;
    }

    @GetMapping("/getScopeTypes")
    public String getPerson() {

        PersonPrototype personPrototype = applicationContext.getBean(PersonPrototype.class);
        PersonPrototype personPrototype2 = this.personPrototype.getObject();;

        return "Singleton: " + personSingleton.getId() +
                "<br><br>Prototype: " + personPrototype.getId() +
                "<br>Prototype2: " + personPrototype2.getId() +
                "<br><br>Request: " + personRequest.getId() +
                "<br>Request2: " + personRequest2.getId() +
                "<br><br>Session: " + personSession.getId();
    }
}
