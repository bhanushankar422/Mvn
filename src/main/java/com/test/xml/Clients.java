package com.test.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName="clients")
public class Clients {
    @JacksonXmlElementWrapper(localName = "client")
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
