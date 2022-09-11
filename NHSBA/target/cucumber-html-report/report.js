$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nhsBsa_flow.feature");
formatter.feature({
  "line": 1,
  "name": "Verify NHSBSA Eligibility Checker Flow",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "I a person from \"\u003cCountry\u003e\", I want to check my eligibility for NHSBSA",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyNHSBSAEligibilityCheckerFlow_Positive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from \"\u003cCountry\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check my eligibility for NHSBSA",
  "rows": [
    {
      "cells": [
        "GP_Practice",
        "Dental_Practice",
        "DOB",
        "Partner",
        "Partner_Benefit_Claim",
        "Universal_Credit",
        "Universal_Credit_Benefit",
        "Take_Home_Pay_Criteria_Meet"
      ],
      "line": 7
    },
    {
      "cells": [
        "\u003cGP_Practice\u003e",
        "\u003cDental_Practice\u003e",
        "\u003cDOB\u003e",
        "\u003cPartner\u003e",
        "\u003cPartner_Benefit_Claim\u003e",
        "\u003cUniversal_Credit\u003e",
        "\u003cUniversal_Credit_Benefit\u003e",
        "\u003cTake_Home_Pay_Criteria_Meet\u003e"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the NHSBSA eligibility checker as \"\u003cIs_Eligible\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;",
  "rows": [
    {
      "cells": [
        "Country",
        "GP_Practice",
        "Dental_Practice",
        "DOB",
        "Partner",
        "Partner_Benefit_Claim",
        "Universal_Credit",
        "Universal_Credit_Benefit",
        "Take_Home_Pay_Criteria_Meet",
        "Is_Eligible"
      ],
      "line": 12,
      "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;1"
    },
    {
      "cells": [
        "Wales",
        "Yes",
        "Wales",
        "11-11-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "Yes",
        "Yes",
        "True"
      ],
      "line": 13,
      "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;2"
    },
    {
      "cells": [
        "Wales",
        "No",
        "Wales",
        "12-12-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "Yes",
        "Yes",
        "True"
      ],
      "line": 14,
      "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;3"
    },
    {
      "cells": [
        "Wales",
        "Yes",
        "Wales",
        "11-11-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "Yes",
        "No",
        "True"
      ],
      "line": 15,
      "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;4"
    },
    {
      "cells": [
        "Wales",
        "Yes",
        "Wales",
        "11-11-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "No",
        "Yes",
        "True"
      ],
      "line": 16,
      "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15165598500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "I a person from \"Wales\", I want to check my eligibility for NHSBSA",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyNHSBSAEligibilityCheckerFlow_Positive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from \"Wales\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check my eligibility for NHSBSA",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "rows": [
    {
      "cells": [
        "GP_Practice",
        "Dental_Practice",
        "DOB",
        "Partner",
        "Partner_Benefit_Claim",
        "Universal_Credit",
        "Universal_Credit_Benefit",
        "Take_Home_Pay_Criteria_Meet"
      ],
      "line": 7
    },
    {
      "cells": [
        "Yes",
        "Wales",
        "11-11-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "Yes",
        "Yes"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the NHSBSA eligibility checker as \"True\"",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 20
    }
  ],
  "location": "NhsBsaSteps.i_am_a_person_from(String)"
});
formatter.result({
  "duration": 6136239300,
  "status": "passed"
});
formatter.match({
  "location": "NhsBsaSteps.i_check_my_eligibility_for_nhsbsa(DataTable)"
});
formatter.result({
  "duration": 15662622600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 48
    }
  ],
  "location": "NhsBsaSteps.i_should_see_the_nhsbsa_eligibility_checker(String)"
});
formatter.write("Actual Result :: true, Expected Result :: true");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 310001600,
  "status": "passed"
});
formatter.after({
  "duration": 1194591800,
  "status": "passed"
});
formatter.before({
  "duration": 8655800400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "I a person from \"Wales\", I want to check my eligibility for NHSBSA",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyNHSBSAEligibilityCheckerFlow_Positive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from \"Wales\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check my eligibility for NHSBSA",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "rows": [
    {
      "cells": [
        "GP_Practice",
        "Dental_Practice",
        "DOB",
        "Partner",
        "Partner_Benefit_Claim",
        "Universal_Credit",
        "Universal_Credit_Benefit",
        "Take_Home_Pay_Criteria_Meet"
      ],
      "line": 7
    },
    {
      "cells": [
        "No",
        "Wales",
        "12-12-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "Yes",
        "Yes"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the NHSBSA eligibility checker as \"True\"",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 20
    }
  ],
  "location": "NhsBsaSteps.i_am_a_person_from(String)"
});
formatter.result({
  "duration": 6557102100,
  "status": "passed"
});
formatter.match({
  "location": "NhsBsaSteps.i_check_my_eligibility_for_nhsbsa(DataTable)"
});
formatter.result({
  "duration": 25965979400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 48
    }
  ],
  "location": "NhsBsaSteps.i_should_see_the_nhsbsa_eligibility_checker(String)"
});
formatter.write("Actual Result :: true, Expected Result :: true");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 342511300,
  "status": "passed"
});
formatter.after({
  "duration": 1706369200,
  "status": "passed"
});
formatter.before({
  "duration": 6232719100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "I a person from \"Wales\", I want to check my eligibility for NHSBSA",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyNHSBSAEligibilityCheckerFlow_Positive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from \"Wales\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check my eligibility for NHSBSA",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "rows": [
    {
      "cells": [
        "GP_Practice",
        "Dental_Practice",
        "DOB",
        "Partner",
        "Partner_Benefit_Claim",
        "Universal_Credit",
        "Universal_Credit_Benefit",
        "Take_Home_Pay_Criteria_Meet"
      ],
      "line": 7
    },
    {
      "cells": [
        "Yes",
        "Wales",
        "11-11-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "Yes",
        "No"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the NHSBSA eligibility checker as \"True\"",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 20
    }
  ],
  "location": "NhsBsaSteps.i_am_a_person_from(String)"
});
formatter.result({
  "duration": 11908437700,
  "status": "passed"
});
formatter.match({
  "location": "NhsBsaSteps.i_check_my_eligibility_for_nhsbsa(DataTable)"
});
formatter.result({
  "duration": 37458900900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 48
    }
  ],
  "location": "NhsBsaSteps.i_should_see_the_nhsbsa_eligibility_checker(String)"
});
formatter.write("Actual Result :: false, Expected Result :: true");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 307964900,
  "error_message": "java.lang.AssertionError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.test.stepdefs.NhsBsaSteps.i_should_see_the_nhsbsa_eligibility_checker(NhsBsaSteps.java:61)\r\n\tat ✽.Then I should see the NHSBSA eligibility checker as \"True\"(nhsBsa_flow.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 1059299900,
  "status": "passed"
});
formatter.before({
  "duration": 5477308700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "I a person from \"Wales\", I want to check my eligibility for NHSBSA",
  "description": "",
  "id": "verify-nhsbsa-eligibility-checker-flow;i-a-person-from-\"\u003ccountry\u003e\",-i-want-to-check-my-eligibility-for-nhsbsa;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@VerifyNHSBSAEligibilityCheckerFlow_Positive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a person from \"Wales\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check my eligibility for NHSBSA",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "rows": [
    {
      "cells": [
        "GP_Practice",
        "Dental_Practice",
        "DOB",
        "Partner",
        "Partner_Benefit_Claim",
        "Universal_Credit",
        "Universal_Credit_Benefit",
        "Take_Home_Pay_Criteria_Meet"
      ],
      "line": 7
    },
    {
      "cells": [
        "Yes",
        "Wales",
        "11-11-1990",
        "Yes",
        "Yes",
        "Yes Universal",
        "No",
        "Yes"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see the NHSBSA eligibility checker as \"True\"",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Wales",
      "offset": 20
    }
  ],
  "location": "NhsBsaSteps.i_am_a_person_from(String)"
});
formatter.result({
  "duration": 4039871500,
  "status": "passed"
});
formatter.match({
  "location": "NhsBsaSteps.i_check_my_eligibility_for_nhsbsa(DataTable)"
});
formatter.result({
  "duration": 15944666100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 48
    }
  ],
  "location": "NhsBsaSteps.i_should_see_the_nhsbsa_eligibility_checker(String)"
});
formatter.write("Actual Result :: true, Expected Result :: true");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 276562700,
  "status": "passed"
});
formatter.after({
  "duration": 1288619800,
  "status": "passed"
});
});