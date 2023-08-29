# Spring Core Project

- [x] Create Maven Archetype
- [x] Add dependencies
  - [x] [Spring Core](https://mvnrepository.com/artifact/org.springframework/spring-core)
  - [x] [Spring Beans](https://mvnrepository.com/artifact/org.springframework/spring-beans)
- [x] Create xml configuration file. [See here](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html)
- [x] Define models. See [`/model`](https://github.com/bithapa/student-spring-core-project/tree/main/src/main/java/com/bikash/model)
- [x] Inject model dependency into the xml config file. Create beans. See [`/spring_config.xml](https://github.com/bithapa/student-spring-core-project/blob/main/src/main/java/com/bikash/config/spring_config.xml)


## File structure

```
Student
    |---src/main/java/com/bikash
    |                        |---config
    |                        |       |---spring_config.xml
    |                        |
    |                        |---model
    |                        |       |---Student.java
    |                        |
    |                        |---App.java
    |
    |---pom.xml           
```