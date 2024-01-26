# Simple Backend RESTAPI that represents games in the database with some information.

## Requests

### GET
You can get info about all games in the database with /games request.
![image](https://github.com/mertvnl/Backend-RestAPI-Java/assets/41839620/8f02b5b9-b1bc-4f53-8793-455000d57a99)

OR information about a game by requesting its ID. i.e. games/65a051b38de57722e2c75704
![image](https://github.com/mertvnl/Backend-RestAPI-Java/assets/41839620/214c7197-0b4b-4193-9929-62d72a0ac668)

### DEL
You can delete a certain game from the database by sending a DEL request with its ID. i.e. games/65a051b38de57722e2c75704

### POST
You can add a new game to the database by sending a post request with a body into /games.
The body would like something like this : 

{
    "name": "portal2",
    "price": "5"
}

### PUT
You can edit an existing game by sending a request with a game ID and a body into games i.e. games/65b30768c11bc1475524c896.
The body would like something like this : 

{
    "name": "palworld",
    "price": "99"
}
