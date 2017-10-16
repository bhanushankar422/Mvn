package com.test.prop;

import com.github.mkolisnyk.cucumber.reporting.CucumberConsolidatedReport;
import com.github.mkolisnyk.cucumber.reporting.CucumberFeatureOverview;

import java.io.File;

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
        CucumberConsolidatedReport results1 = new CucumberConsolidatedReport();
        results1.setOutputDirectory("target");
        results1.setOutputName("cucumber-results");
        results1.setPdfPageSize("A4 landscape");
        results1.setSourceFile("./src/test/resources/cucumber.json");
        try {
            results1.execute(
                    true
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
