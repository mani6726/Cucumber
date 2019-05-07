$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/addtarriff/tarriftask.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be in addtarrif plan page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user fill in the form \"\u003cMonthly Rent\u003e\",\"\u003cFree L/Min\u003e\",\"\u003cFree Intl/Min\u003e\",\"\u003cFree SMS\u003e\",\"\u003cLocal/min Charges\u003e\",\"\u003cIntl/min Charges\u003e\",\"\u003cSMS/Charges\u003e\" and click submit",
  "keyword": "When "
});
formatter.step({
  "name": "The user should see the congrats message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Monthly Rent",
        "Free L/Min",
        "Free Intl/Min",
        "Free SMS",
        "Local/min Charges",
        "Intl/min Charges",
        "SMS/Charges"
      ]
    },
    {
      "cells": [
        "100",
        "12",
        "23",
        "123",
        "45",
        "23",
        "43"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user should be in addtarrif plan page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user fill in the form \"100\",\"12\",\"23\",\"123\",\"45\",\"23\",\"43\" and click submit",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user should see the congrats message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/addtarriff/usinglist.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "add tarrif functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user should launch addtarrif plan page url",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user fill in the form and click submit",
  "rows": [
    {
      "cells": [
        "123",
        "23",
        "45",
        "65",
        "34",
        "21",
        "65"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user should see the congratulation message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});