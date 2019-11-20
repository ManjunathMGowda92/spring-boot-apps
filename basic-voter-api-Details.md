# BASIC-VOTER-API

### Description
 basic-voter-api is a spring boot based application. The application deals with simple API's for Restfull spring boot application.The application is having code for creating a REST webservice API's using the Spring Boot.
 
 
 ## Project details
 Application contains below Components
*  ### Controller Layer : 
 > Controller Code to handle the end points. The end points are having the GET, POST, PUT and DELETE http request methods.
*  ### Service Layer :
> Service Layer code to provide the services between Controller and Data Layer.
*  ### Repository Layer / Data Layer
> DAO calls to handle the database access operations to retrieve and save Data. Fetch and save operations were taken care by the JPARepository.

>To save the data we are using the h2 database.
>Also to store the sample data, used the data.sql file under the resources folder. Spring boot application runs data.sql file to store the sample data into the database.

*  ### Models
> Model Objects to hold the Data. Voter is the only one Model Object used in this application. Also model object is annotated to handle the mapping between the model and database tables(ORM relationships)
* ### Exception Handling.
> Added the Central Exception handling mechanism to handle the exceptions and User will get back the Json response with proper details.
