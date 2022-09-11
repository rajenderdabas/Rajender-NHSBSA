Feature: Verify NHSBSA Eligibility Checker Flow

   @VerifyNHSBSAEligibilityCheckerFlow_Positive
  Scenario Outline: I a person from "<Country>", I want to check my eligibility for NHSBSA
     Given I am a person from "<Country>"
     When I check my eligibility for NHSBSA
        |GP_Practice    |Dental_Practice|DOB       |Partner|Partner_Benefit_Claim|Universal_Credit|Universal_Credit_Benefit|Take_Home_Pay_Criteria_Meet|
        |<GP_Practice>|<Dental_Practice>|<DOB>       |<Partner>|<Partner_Benefit_Claim>|<Universal_Credit>|<Universal_Credit_Benefit>|<Take_Home_Pay_Criteria_Meet>|
     Then I should see the NHSBSA eligibility checker as "<Is_Eligible>"

     Examples:
        | Country |GP_Practice|Dental_Practice|DOB       |Partner|Partner_Benefit_Claim|Universal_Credit|Universal_Credit_Benefit|Take_Home_Pay_Criteria_Meet|Is_Eligible|
        | Wales   |Yes        |Wales          |11-11-1990|Yes    |Yes                  |Yes Universal   |Yes                     |Yes                        |True        |
        | Wales   |No         |Wales          |12-12-1990|Yes    |Yes                  |Yes Universal   |Yes                     |Yes                        |True        |
        | Wales   |Yes        |Wales          |11-11-1990|Yes    |Yes                  |Yes Universal   |Yes                     |No                        |True        |
        | Wales   |Yes        |Wales          |11-11-1990|Yes    |Yes                  |Yes Universal   |No                     |Yes                        |True        |
