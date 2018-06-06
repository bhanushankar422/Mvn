package com.test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.test.xml.Client;
import com.test.xml.Clients;
import com.test.xml.Field;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextXml {

    public static void main(String[] args) throws IOException, XMLStreamException {
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream("src/main/resources/clients.xml"));

        XmlMapper mapper = new XmlMapper();
        sr.next(); // to point to <root>
        sr.next(); // to point to root-element under root
        Clients clients = mapper.readValue(sr, Clients.class);
        sr.close();
        System.out.println(clients);

        Clients clients1 = new Clients();
        Client client = new Client();
        client.setName("test");
        Field field = new Field();
        field.setIsRequired("true");
        field.setKey("abc");
        field.setValue("xyz");
        Field field1 = new Field();
        field1.setIsRequired("false");
        field1.setKey("abc1");
        field1.setValue("xyz1");
        Field[] fields = {field, field1};
        client.setFields(fields);
        Client[] clients2 = {client};
        clients1.setClients(clients2);
        mapper.writeValue(new File("simple_bean.xml"), clients1);
    }
}
