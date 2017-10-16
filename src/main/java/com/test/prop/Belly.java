package com.test.prop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Belly {
    public void eat(int cukes) {
        System.out.println("In Belly eat");
        String resourceName = "app.properties"; // could also be a constant
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        try {
            try(InputStream resourceStream = loader.getResourceAsStream(resourceName)) {
                props.load(resourceStream);
                System.out.println(props.getProperty("name"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
