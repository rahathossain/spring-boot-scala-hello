## Steps

To create a simple spring boot project using scala we need to do the following steps  
1. Get scala support for IntelliJ IDEA IDE
2. Import from newly created spring boot initializr demo project
3. Update POM for scala support 
4. Add Sample scala code 
5. Build, run Spring boot scala project
6. Package and run Spring boot scala project

## 1. Get scala support for IntelliJ IDEA IDE

Setup your IDE support for Scala, such as for Idea follow instruction below link  
> https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html


## 2. Import from newly created spring boot initializr demo project

open the spring boot initializr page below and generate a demo project

> https://start.spring.io/

![2 a](https://user-images.githubusercontent.com/1764183/43835338-ede3f96e-9b54-11e8-8856-e2ee3a067447.png)

Extract the zip file and import the project from IntelliJ IDEA IDE   

![2 b](https://user-images.githubusercontent.com/1764183/43835347-f98b9506-9b54-11e8-8f78-f24f41da6b68.png)

## 3. Update POM for scala support 

Add scala version in the properties section of the POM 

```xml
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
        <scala.version>2.12.1</scala.version>
    </properties>
```

Add scala dependency in the dependencies section 

```xml
    <dependency>
        <groupId>org.scala-lang</groupId>
        <artifactId>scala-library</artifactId>
        <version>${scala.version}</version>
    </dependency>
```

Add scala plugin in the plugins sections 

```xml
    <plugin>
        <groupId>net.alchim31.maven</groupId>
        <artifactId>scala-maven-plugin</artifactId>
        <version>3.1.3</version>
        <executions>
            <execution>
                    <goals>
                        <goal>compile</goal>
                        <goal>testCompile</goal>
                    </goals>
            </execution>
        </executions>
    </plugin>
```

## 4. Add Sample scala code 

In the IDE, create a folder named `scala` under `project > src > main` and mark the folder as source directory by right click, `Marked Directory as`  `Sources Root` 

![4 a](https://user-images.githubusercontent.com/1764183/43835359-033d383e-9b55-11e8-8b34-00571b753b3a.png)

delete `java` Source directory which came by default 

Create a package under `scala` directory called `com.example.springbootscalahello` and create a scala class file called `SpringBootScalaHelloApplication`  

![4 b](https://user-images.githubusercontent.com/1764183/43835360-037577da-9b55-11e8-98c8-cca8a2e16d4c.png)

Open scala file `SpringBootScalaHelloApplication` and copy paste the below code 

```scala
package com.example.springbootscalahello

import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class SpringBootScalaHelloApplication extends CommandLineRunner{
  override def run(args: String*): Unit = println("\n\n\n *** Hello World \n\n\n")
}

object SpringBootScalaHelloApplication extends App {
  SpringApplication.run(classOf[SpringBootScalaHelloApplication])
}

```

## 5. Build, run Spring boot scala project

To build, from IDE, click `Build > Build Project` 

![5 a](https://user-images.githubusercontent.com/1764183/43835361-03adb32a-9b55-11e8-9b6e-1ff46cda8d73.png)


To Run, from IDE, click `Run > Run 'SpringBootScalaHelloApplication'`

![5 b](https://user-images.githubusercontent.com/1764183/43835363-03e1be22-9b55-11e8-9c23-fef1e43b467b.png)

See the output 

![5 c](https://user-images.githubusercontent.com/1764183/43835364-042df508-9b55-11e8-9170-f24b2dfa5cd4.png)

## 6. Package and run Spring boot scala project
From IDE, right click on project root and click on `Open in terminal`
run the following commands:

> mvn clean
> mvn compile 
> mvn package
> java -jar target\spring-boot-scala-hello-0.0.1-SNAPSHOT.jar


