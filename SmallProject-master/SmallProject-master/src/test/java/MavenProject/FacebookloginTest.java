package MavenProject;

import org.testng.annotations.Test;

import junit.framework.Assert;
//1. To install maven, download from the site and take path of file and add in enviroment variables and bin path in path varible new

	//To check if mvn is installed,
	//use this mvn --version

	//Step 1 : to create a project
    //mvn archetype:generate -DgroupId=MavenProject  -DartifactId=Smallproject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
	//Step 2 : to intergrate maven project to eclipse ,go to the project  
	// cd Smallproject
	// mvn eclipse:eclipse
   // Step 3: import the Maven project from eclipse and create your own classes
   // Create class which ends with Test
  // add plugin code from https://maven.apache.org/surefire/maven-surefire-plugin/usage.html

	 //3.To clean the project - mvn clean
     //4. to compile the project - mvn compile
     //5.to run the project - mvn test 

// Note : when u run a project first it wil read the POM file. and then check for the jar files in mv2 folder. If not
 //available then it wil get the jars downloaded from maven website

//Note 2 : if u want to run the tests specified in the XML file, then u need to add configuration in the POM.Else if you
//remove, it will run all the tests in the project

 //6.to run only one class - mvn -Dtest=classname test

//you can create profiles in POM to run a set of classes. In each profile u can set the XMl to run
// 7.To run the profile mvn test -Pprofilename

public class FacebookloginTest {
	@Test
	public void loginpagefb() {

		System.out.println("logged in FB");
		Assert.assertTrue(false);
	}

	@Test
	public void Trasactionsfb() {

		System.out.println("transactions done in FB");
	}

}
