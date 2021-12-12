package com.in28minutes.cloudDydko.webservices.restfulwebservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping("v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Mirosław Dyduch");
    }

    @GetMapping("v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Mireczek", "Dydko"));
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=1")
    public PersonV1 paramV1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Miro", "Dydo"));
    }

    @GetMapping(value = "person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 produceV1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 produceV2() {
        return new PersonV2(new Name("Miro", "Dydo"));
    }
}
