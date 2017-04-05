# springmvc
springmvc is the parent project with web, services, dao, domain and util as submodules.
web has the spring boot startup class, which will start and read thru the configuration files in different modules.
services module has the business logic and interaction with dao layer to get data from backend db
dao using spring-jpa is responsible for connecting to database (in this case mysql running in local) and bringing entities using datasource and entitymanager.
domain has pojos shared between server side code and frontend.

Build parent project using mvn clean install, and then run mvn spring-boot:run moving to web module.
Application starts up on tomcat listening at port defined in application.properties.
