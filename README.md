# qaa-star-wars
Automation Scripts of UI and APIs for Star Wars Project

Steps and commands to Execute.

Navigate to location of pom.xml using command line.
Execute following xml files for UI Cases.

mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/TestNg_Xmls/FIlmsPage/FilmsSuite.xml -Dbrowser=chrome

mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/TestNg_Xmls/VideoPage/VideoPageSuite.xml -Dbrowser=chrome

mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/TestNg_Xmls/HomePage/HomePageSuite_AllCases.xml -Dbrowser=chrome

Note : Current Support only for chrome browser


