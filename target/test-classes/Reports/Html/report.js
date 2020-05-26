$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dell/eclipse-workspace/Abi/TestNG/FirstProCucu/src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Generating order no",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.scenario({
  "name": "test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "name": "Have to open adacin page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Verify Username and Password matched",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Have to open adacin page",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Give \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "name": "Give all details in search page \"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoom Type\u003e\",\"\u003cNo of Rooms\u003e\",\"\u003cCheck-in\u003e\",\"\u003cCheck-out\u003e\",\"\u003cAdult -Room\u003e\",\"\u003cChildren - Room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click submit",
  "keyword": "And "
});
formatter.step({
  "name": "Give details in booking \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003caddress\u003e\",\"\u003ccredit\u003e\",\"\u003ccredittype\u003e\",\"\u003cmonth\u003e\",\"\u003cyear\u003e\",\"\u003cccvv\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click search",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass",
        "Location",
        "Hotels",
        "Room Type",
        "No of Rooms",
        "Check-in",
        "Check-out",
        "Adult -Room",
        "Children - Room",
        "firstname",
        "lastname",
        "address",
        "credit",
        "credittype",
        "month",
        "year",
        "ccvv"
      ]
    },
    {
      "cells": [
        "abiraghul6",
        "Abi3988",
        "London",
        "Hotel Hervey",
        "Super Deluxe",
        "3 - Three",
        "23/06/2022",
        "27/06/2022",
        "3 - Three",
        "2 - Two",
        "Abinaya",
        "Rithu",
        "Karapakkam",
        "8765432197634521",
        "Master Card",
        "March",
        "2022",
        "345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Username and Password matched",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "name": "Have to open adacin page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter \"abiraghul6\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Give \"Abi3988\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Give all details in search page \"London\",\"Hotel Hervey\",\"Super Deluxe\",\"3 - Three\",\"23/06/2022\",\"27/06/2022\",\"3 - Three\",\"2 - Two\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click submit",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Give details in booking \"Abinaya\",\"Rithu\",\"Karapakkam\",\"8765432197634521\",\"Master Card\",\"March\",\"2022\",\"345\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click search",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});