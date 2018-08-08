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
