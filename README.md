# MINDBODY SOAP API Contracts for Java

This is a Java wrapper for the MINDBODY SOAP contracts (version 5.1)

The library uses auto-generated files from [wsimport]('https://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html')

## Installation

The build is distributed openly using JitPack

### Maven


Add the JitPack repository

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

Add the dependency to your pom.xml

```xml
<dependency>
	<groupId>com.github.mattlisiv</groupId>
	<artifactId>mindbody-api-java</artifactId>
	<version>0.0.2</version>
</dependency>
```

### Gradle

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency

```groovy
dependencies {
	compile 'com.github.mattlisiv:mindbody-api-java:0.0.1'
}
```

## Usage


First, import the necessary libraries you want to utilize:

```java
import com.mindbodyonline.clients.api._0_5_1.class_service.*;
```


Below is an example of how to retrieve a list of 20 classes and print out the class names.
Replace the XXXX's with your credentials and -99 with your SiteID.

```java
GetClassesRequest request = new GetClassesRequest();
request.setCurrentPageIndex(0);
request.setPageSize(20);
request.setXMLDetail(XMLDetailLevel.FULL);
ArrayOfInt arrayOfInt = new ArrayOfInt();
arrayOfInt.getInt().add(-99);

// Source Credentials
SourceCredentials credentials = new SourceCredentials();
credentials.setSourceName("XXXX");
credentials.setPassword("XXXX");
credentials.setSiteIDs(arrayOfInt);

// User Credentials
UserCredentials userCredentials = new UserCredentials();
userCredentials.setUsername("XXXX");
userCredentials.setPassword("XXXX");
userCredentials.setSiteIDs(arrayOfInt);

// Set Sources
request.setSourceCredentials(credentials);
request.setUserCredentials(userCredentials);

// Get Class Service
ClassX0020Service service = new ClassX0020Service();
ClassX0020ServiceSoap soap = service.getClassX0020ServiceSoap();
GetClassesResult result = soap.getClasses(request);
ArrayOfClass sales = result.getClasses();

// Iterate through retrieved classes
if (sales != null && sales.getClazz() != null) {
	List<Class> classes = sales.getClazz();
		for(Class classInstance: classes) {
		System.out.println("Class Name:" + classInstance.getClassDescription().getName());
	}
} else {
	System.out.println("No classes returned");
}
```


