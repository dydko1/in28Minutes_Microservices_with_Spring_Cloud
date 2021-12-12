package com.in28minutes.cloudDydko.webservices.restfulwebservice.filtring;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String field1;
    private String field2;
    //@JsonIgnore
    private String filed3;

    public SomeBean(String field1, String field2, String filed3) {
        super();
        this.field1 = field1;
        this.field2 = field2;
        this.filed3 = filed3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }
}
