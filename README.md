# Indian-State-Census-Analyser-Problem


Start with Displaying Welcome to Message







UseCase1- Ability for the analyser
to load the Indian States Census Information from a csv file
- Create a StateCensusAnalyser Class to load
the State Census CSV Data
- Create CSVStateCensus Class to load the
CSV Data
- Use Iterator to load the data - Check with StateCensusAnalyser to ensure





















Test Case1.1-Given the States
Census CSV file, Check to ensure the Number
of Record matches
This is a Happy Test Case where the records
are checked.












TestCase 1.2-Given the State Census
CSV File if incorrect
Returns a custom
Exception

This is a Sad Test Case to verify if the
exception is raised.





















TestCase 1.3-Given the State Census
CSV File when correct
but type incorrect
Returns a custom
Exception

This is a Sad Test Case to verify if the type is
incorrect then exception is raised.












TestCase 1.4-Given the State Census
CSV File when correct
but delimiter incorrect
Returns a custom
Exception

This is a Sad Test Case to verify if the file
delimiter is incorrect then exception is raised. 















TestCase 1.5-Given the State Census
CSV File when correct
but csv header
incorrect Returns a
custom Exception

This is a Sad Test Case to verify if the header is
incorrect then exception is raised.















Usecase 2- Ability for the analyser
to load the Indian
States Code Information from a csv
file - Create CSVStates Class to load the CSV Data - Use Iterator to load the data - Check with StateCensusAnalyser to ensure
number of record matches
















TestCase- Like UC 1 repeat all
the 5 TC for UC 2

Repeat all the Happy and Sad Test Cases
