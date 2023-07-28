# Music Streaming Service API Application :-
* Swagger Link :
* http://16.16.57.33:8080/swagger-ui/index.html#/

## Dependencies:
- spring web
- spring devtools
- lombok
- validation
- mysql driver
- spring data jpa
- swagger
  
## Frameworks and language used:
-  Java
-  Spring Boot
-  SQL database
-  Postman
-  Swagger
-  Maven


## Data Flow


* **Model** :
* 
  There are Three Model class in this application.
    * User Model 
    * Song Model 
    * Playlist Model 



* **Controller** :

  There are Two Controller class in this application.

    * AdminController
    * UsersController


* **Service** :

  There are Three Service class in this application.

    * UserService 
    * PlaylistService 
    * SongService 

    
* **Repository** :

  There are Three Repository Interfaces in this application.

    * IUserRepo 
    * IPlaylistRepo 
    * ISongRepo 



* **Validation** :
    * In this application I'm using annotations based validation with manual validations for more safety and to keep continuity in data .




* **Database**

    * I have used SQL Database to store the data.
    * I have deployed this project on AWS EC2 machine.

## Project Summary

This project is a music streaming service API that allows two types of users: Normal and Admin users. Admin users have the authority to perform CRUD (Create, Read, Update, and Delete) operations on songs, while normal users can only add songs to their playlists and perform CRUD operations on their playlists.

The API is built using MySQL database to store songs and user playlists, and its IP address of the deployment link must be static to ensure its availability. Additionally, the API uses annotation-based validation to ensure that all user inputs are valid before being processed.

The project structure includes a controller, service and  repository, providing a clear separation of concerns and making the code more modular. Furthermore.

To ensure data security and user data privacy, normal users cannot create or do CRUD operations on songs, and only Admin users have the necessary permissions to perform these actions. This ensures that the API is both secure and user-friendly.

Overall, this project provides a scalable and secure API for music streaming services that allows users to manage their playlists effectively while ensuring the safety of their data.
