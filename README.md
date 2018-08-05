## ProSpring5
#### 0. Introduction to spring framework 5 core library
    the three major Spring 5.0 libraries are spring-core,spring-beans,and spring-context, 
    because the major classes and interfaces for creating the container are found in these libraries. 
    1: BeanFactory
        The basic container that manages objects in Spring is provided by the
        org.springframework.beans.factory.BeanFactory interface and can only be found
        in the spring-beans module
    2: ApplicationContext
       the ApplicationContext,namely the org.springframework.context.ApplicationContext interface,which is sub-interface of BeanFactory.
       the ApplicationContext provides features like message resource handling, AOP capabilities, application-specific contexts,
       and the listener implementation.
       the ApplicationContext,found in spring-context modules, is the one that provides
       an enterprise-specific container for all its applications because it encompasses a larger scope of Spring components than its BeanFactory interface.
       
#### 1. How to Address reusability problem in your enterprise application
    To address the reusability problem in our enterprise application, we can use
    various design patterns, such as the Factory pattern, Abstract Factory pattern, Builder pattern,
    Decorator pattern, and Service Locator pattern, to compose the basic building blocks into a coherent
    whole, such as class and object instances, to promote the reusability of components. 
    These patterns above address the common and recursive application problems.
    Spring Framework simply implements these patterns internally, providing you with an infrastructure to use in a formalized way.
  
#### 2. Spring Framework Documentation

* [Spring IndexPage](https://spring.io/)

* [Spring Framework Reference](https://docs.spring.io/spring/docs/current/spring-framework-reference/)

* [Quick Start](https://projects.spring.io/spring-framework/)

* [Spring Initializr](https://start.spring.io/)

* [Getting Started Guides](https://spring.io/guides)

* [Spring At StackOverFlow](https://spring.io/questions)

* [Spring Framework Wiki](https://github.com/spring-projects/spring-framework/wiki)

* [learning google guice](https://bitbucket.org/hussain-pithawala/begin_guice/)
