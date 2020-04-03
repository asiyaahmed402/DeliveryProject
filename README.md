# Delivery Project
This program represent a consortium of shops in a large city that established an agreement with local independent van and taxi drivers to deliver products from the stores to the customer destinations. When a store gets a product delivery order, it creates a request which is broadcast to relevant drivers within a certain distance from the store. A driver is then assigned based on the closest driver distance to the shop.


## Features
-This project was built using Observer Design Pattern.

-using this pattern help to solve tightly coupled between objects.

-when we have one-to-many dependency.

-This can ensure that when one object changes state an open-ended number

-of dependent objects are updated automatically.

-This makes subject and observers loosely coupled.

-Subject and observers have no explicit knowledge of each other.

-Observers can be added and removed independently at run-time.

-This add flexibility to the program



##Details

1-At the binging orders data is registered in the shop system.

2- the order products were not implemented it just passed as null for now.

3- Every new driver is added to the shop system so he will be notified for the new order.

4-The diver will accept all order assign to him just if he is not busy.

5- The shop system choose the driver with the less distance to travel.

6- The less distance is equal to driver distance from store with the customer distance.

7- The driver will be updated with all the order data the he will carry.

8- Driver status is "available" if he can accept order and "in transit" . if he is in his way to deliver an order.

9- If all drivers are busy the order will wait until a one driver is available.

10- the shop system track all driver’s status in each time tick.

##Future

1- The project can have more functionality if the user can place his order.

2- The shop system could search for the nearest store to prepare the order.

3- It can have GBS location for the drivers.

More features can be added to the (Product):

1- Each product has price.

2- The birthday gift is free and it just assigned to birthday person.

3- User cannot get more products from the same kind.

4- Assume there is enough products in each stores.

5- All the stores have the same products.

6- Food class has status (if is frozen)

7- For warm food I assumed all driver has a delivery bag so no warry about it.











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


