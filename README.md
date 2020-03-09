# spring-boot-actuator-example #

This example demonstrates how to enable spring boot actuator endpoints for monitoring

### Maven Dependency for Actuator

```
<dependency>	
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

### Actuator Endpoints

By default actuator only enables '/actuator', '/actuator/health', '/actuator/info' Endpoints. To enable other endpoints like metrics, mappings and etc. please add below line to application.properties file.

```
management.endpoints.web.exposure.include=*
```


### Actuator URL 

Access the url *http://localhost:8080/actuator* and then follow other endpoints to see various options available. 