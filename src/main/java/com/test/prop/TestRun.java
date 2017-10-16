package com.test.prop;

import com.github.mkolisnyk.cucumber.reporting.CucumberFeatureOverview;

public class TestRun {
    public static void main(String[] args){
        System.out.println(" In Test Run main");
        CucumberFeatureOverview results = new CucumberFeatureOverview();
        results.setOutputDirectory("target/reports");
        results.setOutputName("cucumber-results");

        results.setSourceFile("./target/cucumber.json");
        try {
            results.execute(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
