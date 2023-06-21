$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/customer/Feature_CustomerLoginFunctionality.feature");
formatter.feature({
  "name": "Verify Customer Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Customer Login functionality happy path",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am in landing page http://it.microtechlimited.com",
  "keyword": "Given "
});
formatter.step({
  "name": "I Click on Login menu",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Customer Login",
  "keyword": "And "
});
formatter.step({
  "name": "Enter User Id as \"\u003cuserId\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I Enter Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify that I am in CUSTOMER Home Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "password"
      ]
    },
    {
      "cells": [
        "david@gmail.com",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Customer Login functionality happy path",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in landing page http://it.microtechlimited.com",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.i_am_in_landing_page_http_it_microtechlimited_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.i_Click_on_Login_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customer Login",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.click_on_Customer_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter User Id as \"david@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.enter_User_Id_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter Password as \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.i_Enter_Password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.i_Click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that I am in CUSTOMER Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustomerLoginFunctionality.verify_that_I_am_in_CUSTOMER_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/customer/Feaure_CustomerOrder.feature");
formatter.feature({
  "name": "Customer orders functionality",
  "description": "  As a Customer\n  I want to See my Orders\n  So that I can manage my Orders",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer Order total count Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in as Customer",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustoemrOrder.i_logged_in_as_Customer_with_and(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Order List Menu",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustoemrOrder.click_on_Order_List_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Total Order count is greater than 100",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.customer.StepDefs_CustoemrOrder.verify_Total_Order_count_is_greater_than(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});