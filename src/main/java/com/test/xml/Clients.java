package com.test.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;
@JacksonXmlRootElement(localName = "clients")
public class Clients {
    @JacksonXmlProperty(localName = "client")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Client[] clients;

    @Override
    public String toString() {
        return "Clients{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
