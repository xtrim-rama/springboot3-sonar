Step-1 : First locally Download and Install SonarQube Community Edition from : https://www.sonarsource.com/products/sonarqube/downloads/
-Extract download file to specific folder then goto sonarqube-10.2.0.77647\bin\windows-x86-64 and double click StartSonar.bat file to start sonarqube
which by default run on 9000.
- Then we can access it http://127.0.0.1:9000/
To login use default userid : admin and password: admin

Step-2 : Create Spring boot application and add two plugin in pom.xml file as:
<plugin>
<groupId>org.sonarsource.scanner.maven</groupId>
<artifactId>sonar-maven-plugin</artifactId>
<version>3.8.0.2131</version>
</plugin>
<plugin>
<groupId>org.jacoco</groupId>
<artifactId>jacoco-maven-plugin</artifactId>
<version>0.8.5</version>
<executions>
<execution>
<id>prepare-agent</id>
<goals>
<goal>prepare-agent</goal>
</goals>
</execution>
<execution>
<id>report</id>
<goals>
<goal>report</goal>
</goals>
</execution>
</executions>
</plugin>

Step-3 : After Complete Spring Boot Application then run mvn clean org.jacoco:jacoco-maven-plugin:preapre-agent install on terminal
After succesfull build

Step-4 : Go to Sonar server site -> On Right Top Corner Go to -> My Account -> Click on Security Tab (beside profile tab)
->Enter Token Name and Token Type as Global Analysis Token -> then click Generate Token -> Copy that Token.

Step-5 : mvn clean install sonar:sonar -Dsonar.login=<Paste That Token Here>

Step-6 : After Peforming above steps now in Project Session our project shows on Sonar Report.