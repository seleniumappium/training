$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature Tests",
  "description": "",
  "id": "login-feature-tests",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 6727269123,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User Opens the CAC application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_Opens_the_CAC_application()"
});
formatter.result({
  "duration": 1389319450,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "test login with valid credentials",
  "description": "",
  "id": "login-feature-tests;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enter username \"johnbush@chinna.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enter password \"secret\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "johnbush@chinna.com",
      "offset": 21
    }
  ],
  "location": "LoginStepDefinition.user_enter_username(String)"
});
formatter.result({
  "duration": 407997101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret",
      "offset": 21
    }
  ],
  "location": "LoginStepDefinition.user_enter_password(String)"
});
formatter.result({
  "duration": 90675165,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1240582297,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.login_should_be_successful()"
});
formatter.result({
  "duration": 6094139908,
  "status": "passed"
});
formatter.after({
  "duration": 126804719,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "test login with invalid credentials",
  "description": "",
  "id": "login-feature-tests;test-login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@smoke"
    },
    {
      "line": 15,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User enter invalid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enter invalid password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Login should be failed with \"\u003cerrormessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login-feature-tests;test-login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "errormessage"
      ],
      "line": 23,
      "id": "login-feature-tests;test-login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "abc@gmail.com",
        "abc",
        "An incorrect Email address or Password was specified",
        ""
      ],
      "line": 24,
      "id": "login-feature-tests;test-login-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "xyz@abc.com",
        "xyz",
        "An incorrect Email address or Password was specified",
        ""
      ],
      "line": 25,
      "id": "login-feature-tests;test-login-with-invalid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4558198459,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User Opens the CAC application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_Opens_the_CAC_application()"
});
formatter.result({
  "duration": 1127406744,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "test login with invalid credentials",
  "description": "",
  "id": "login-feature-tests;test-login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@smoke"
    },
    {
      "line": 15,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User enter invalid username \"abc@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enter invalid password \"abc\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Login should be failed with \"An incorrect Email address or Password was specified\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enter_invalid_username(String)"
});
formatter.result({
  "duration": 234399120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enter_invalid_password(String)"
});
formatter.result({
  "duration": 57875754,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 305966166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "An incorrect Email address or Password was specified",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.login_should_be_failed_with(String)"
});
formatter.result({
  "duration": 33830775,
  "status": "passed"
});
formatter.after({
  "duration": 87380341,
  "status": "passed"
});
formatter.before({
  "duration": 3656559967,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User Opens the CAC application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_Opens_the_CAC_application()"
});
formatter.result({
  "duration": 1043130875,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "test login with invalid credentials",
  "description": "",
  "id": "login-feature-tests;test-login-with-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@smoke"
    },
    {
      "line": 15,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User enter invalid username \"xyz@abc.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enter invalid password \"xyz\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Login should be failed with \"An incorrect Email address or Password was specified\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "xyz@abc.com",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enter_invalid_username(String)"
});
formatter.result({
  "duration": 374118670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enter_invalid_password(String)"
});
formatter.result({
  "duration": 77762693,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 325820661,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "An incorrect Email address or Password was specified",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.login_should_be_failed_with(String)"
});
formatter.result({
  "duration": 32815848,
  "status": "passed"
});
formatter.after({
  "duration": 71385037,
  "status": "passed"
});
});