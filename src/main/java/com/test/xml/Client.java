package com.test.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;


public class Client {
    @JacksonXmlProperty(isAttribute = true)
    private String name;

    @JacksonXmlElementWrapper(localName = "fields")
    @JacksonXmlProperty(localName = "field")
    private Field[] fields;

    @JacksonXmlElementWrapper(localName = "userlogins")
    @JacksonXmlProperty(localName = "userlogin")
    private Userlogin[] userlogins;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", fields=" + Arrays.toString(fields) +
                ", userlogins=" + Arrays.toString(userlogins) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field[] getFields() {
        return fields;
    }

    public void setFields(Field[] fields) {
        this.fields = fields;
    }

    public Userlogin[] getUserlogins() {
        return userlogins;
    }

    public void setUserlogins(Userlogin[] userlogins) {
        this.userlogins = userlogins;
    }
}
