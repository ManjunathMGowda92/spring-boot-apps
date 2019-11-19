# VOTERS-APP-WITH-SWAGGER

### Description
 voters-app-with-swagger is a spring boot based application. The application deals with implementing swagger for spring boot applications.The application is also having the Exception handling mechanisms.
 
 
 ## Project details
Application contains below Components
*  ### Controller Layer : 
 > Controller Code to handle the end points. The end points are having the GET, POST, PUT and DELETE http request methods.
*  ### Service Layer :
> Service Layer code to provide the services between Controller and Data Layer.
*  ### Repository Layer / Data Layer
> DAO calls to handle the database access operations to retrieve and save Data. Fetch and save operations were taken care by the JPARepository. Custom Queries were handled by using the @Query and @Transactional annotations.

>To save the data we are using the h2 database
*  ### Models
> Model Objects to hold the Data. Voter is the only one Model Object used in this application. Also model object is annotated to handle the mapping between the model and database tables(ORM relationships)
*  ### Swagger Implementation
> Implemented the swagger to generate the swagger UI to expose the API's. Swagger provides documentation for REST api's. It automatically generate an Open API document based on the code itself.
