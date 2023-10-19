# Project_2_0

***MySQL server setup***

## MySQL
*application.properties* - must have parts
```
spring.datasource.url=jdbc:mysql://localhost:3306/ << service_name(which depends on the microservice) >>  
spring.datasource.username=root  
spring.datasource.password=root  
spring.sql.init.mode=always  
spring.jpa.hibernate.ddl-auto=create-drop  
```
## Commands for creating the MySQL databases for micro-services
Have to run so all micro-services have own database  
```
CREATE DATABASE media_service;
CREATE DATABASE rating_service;
CREATE DATABASE genre_service;
```
