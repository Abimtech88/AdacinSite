package com.auto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "C:/Users/Dell/eclipse-workspace/Abi/TestNG/FirstProCucu/src/test/resources/Feature/Login.feature",
monochrome = true,plugin = {"pretty",
		"html:src\\test\\resources\\Reports\\Html",
		"junit:src\\test\\resources\\Reports\\Xml\\loginxml.xml",
		"json:src\\test\\resources\\Reports\\Json\\loginjson.json"}
)

public class TestRunner1 {

}
