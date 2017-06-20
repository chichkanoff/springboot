package io.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
    private String lastName;

    public Message() {
    }

    public Message(String lastName) {

        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
