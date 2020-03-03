# European Dynamics Training

## Project 2: Java Web Development Training

### Scope
The scope of this project is to emulate the workflow of an actual project and the daily tasks of the developers. In 
that context, a basic structure of a Java Web project is committed on the training GIT repository. The Trainee is 
required to setup the environment and perform a set of specific tasks. 

### Environment setup
In order to implement this project, the development environment described in Project 1 should be set up. In addition, 
the following steps should be completed:
1. Download and install Oracle Database Express Edition 11g R2 or Oracle Database 12c R2 [1]. 
2. Download and install SQL Developer [2]. This download requires an Oracle Account.
3. Download and install Wildfly 10 Application Server [3].

### Business Requirements
1. The system to be implemented should perform CRUD operations on users, roles and addresses.
2. The system will expose to the end user a web interface that will display the user data in a table view format. The 
end user will be able to add, edit and delete users and roles as well as assign roles to users.
3. Validations should be performed in the server side for all input parameters.

### Notes for development
1. All application data will be stored utilizing the Oracle Database.
2. Two applications should be implemented for this project, i.e. a frontend and a backend application.
3. The backend application should be the business tier where all business logic and validations will be executed. It 
will be deployed on Wildfly Application Server [3]. Only this tier will have direct access to the database, utilizing 
the appropriate JDBC driver and Hibernate/JPA. The Spring Data JPA will be used for the data repositories. The backend 
will expose a REST interface, to be consumed by the frontend application. 
4. The project structure is committed in the ecomm-thess-training repo on development branch. Example classes have been 
created for all tiers of the backend application.
5. The frontend application should be the presentation layer. It should use JSF or ExtJS. In case of JSF, the frontend 
application will also be deployed on Wildfly Application Server. 
6. For the database schema, the following tables and columns are foreseen:
    * T_USER (Table)
        - T_USER_ID (column - pk)
        - FIRSTNAME (column - Text)
        - LASTNAME (column - Text)
        - AGE (column - integer)
    * T_USER_ROLE (Table)
        - USER_ID (column - fk to USER table)
        - ROLE_ID (column - fk to ROLE table)
    * T_ROLE (Table)
        - T_ROLE_ID (column - pk)
        - ROLE_NAME (column – Text – Unique – Not null)
    * T_ADDRESS (Table)
        - T_ADDRESS_ID (column - pk)
        - USER_ID (column – fk to USER table)
        - STREET (column – Text)
        - CITY (column - Text)
7. The implementation of all tasks in the context of the current project should be committed in a new branch for each 
developer.
8. The backend should include unit tests covering the basic methods
9. Javadoc (based on Java guidelines on how to write proper javadoc) should be added for the basic methods


### Tasks
1. Create the following REST endpoints for users management
    * GET /users/ (i.e. fetchAll) with paging and sorting. Default values should be "10 entries per page" and "ID ascending respectively".
    * GET /users/{userId} (i.e. fetchById) 
    * POST /users/ (i.e. create). Note: Roles and Addresses are not mandatory when creating a user.
    * PUT /users/{userId} (i.e. update)
    * DELETE /users/{userId} (i.e. delete)
2. Create the following REST endpoints for roles management
    * GET /roles/ (i.e. fetchAll) with paging and sorting. Default values should be "10 entries per page" and "ID ascending respectively".
    * GET /roles/{rolesId} (i.e. fetchById)
    * POST /roles/ (i.e. create) 
    * PUT /roles/{roleId} (i.e. update)
    * DELETE (i.e. should allow only if no users are associated with the specific role)
3. Create the following REST endpoints for addresses management
    * POST /addresses/ (a user id will be also required as an input)
    * DELETE /addresses/{addressId} 
4. Create the following REST endpoints for the user – role associations
    * POST /users/{userId}/roles/{roleId} (associate a user to a role)
    * DELETE /users/{userId}/roles/{roleId} (remove an association of a user with a role)
5. Add a new column to T_ADRESS table 
    * name: COUNTRY
    * type: VARCHAR(1024 char)
Manual testing of the REST endpoints can be performed with Postman.

### References
1. http://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html
2. http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html
3. http://wildfly.org 
