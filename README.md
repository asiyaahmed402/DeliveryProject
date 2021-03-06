# Delivery Project
This program represent a consortium of shops that have established an 
agreement with local independent drivers (sedan and sprinter vans) to 
deliver products from various local businesses to their customers

## Features
-This project was built using Observer Design Pattern. Observer pattern helps
resolve tightly coupling between objects. Here we have a one-to-many dependency 
-This pattern adds flexibility to the program 
-Observers can be added and removed at run-time
-When one object changes its state, dependent objects will be updated automatically 
-Subject and observers don't have explicit knowledge of each other 

##Details

1-Orders data is registered in the shop system while the order products were not implemented it just passed as null for now.

3- Every new driver that is  added to the shop system will be notified of the new order.

4-Drivers will accept all order assign to them if they are not busy and
the shop system choose the driver with the less distance to travel

5- The driver will be updated with all the order data the he will carry.

6- Available status: if driver accepts order 
7- In-transit status: If the driver is on their way to deliver the order

8- If all drivers are busy the order will wait until a one driver is available.


##Future Implementation Suggestions 

1- This project should allow users to place their own orders

2- Each product or item in every "shop" should have a price in the system

3- Special discounts should be available for certain products 






# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


