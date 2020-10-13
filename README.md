# Spring REST API Example for Users using MongoDB

This is my example project for a Spring Boot REST API for a CRUD-style application.

It follows [Thomas Gleason's blog tutorial](https://medium.com/@gtommee97/rest-api-java-spring-boot-and-mongodb-4dffbcabbaf5).

## Getting Started

For docker setup, run:

```
docker-compose build && docker-compose up
```

Spin down with:

```
docker-compose down
```

Example (lists all current Users):
```
curl http://localhost:8080/users
```

### Stack / Tools

Setup was created using [Spring Initializr](https://start.spring.io/)

* Spring Boot
  - Spring WEB
* MongoDB 


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

