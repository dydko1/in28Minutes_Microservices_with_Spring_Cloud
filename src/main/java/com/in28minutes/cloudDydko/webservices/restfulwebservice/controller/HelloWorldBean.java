package com.in28minutes.cloudDydko.webservices.restfulwebservice.controller;

public class HelloWorldBean {
    public String message;
    public String message2;

    public HelloWorldBean(String message) {
        this.message = message + ": first message!!!";
        this.message2 = "Miro tests" + ": second message!!!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                ", message2='" + message2 + '\'' +
                '}';
    }
}
