# Agile246
A School Project in Module 426 (Developing softawre with agile methods). Our Project is a web application made with ReactJS and MVN Springboot. 


MYSQL:

drop database if exists agile426;

Create database if not exists agile426;

use agile426;


Insomnia:

POST: http://127.0.0.1:8080/api/auth/signup
{
  			"name": "Bob Bobison",
  			"username": "xXbob69Xx",
  		  "email": "b123ob@bob.ch",
  		  "password": "secretbob"
}


POST: http://127.0.0.1:8080/api/auth/signin
{
  			"username": "xXbob69Xx",
  		  "password": "secretbob"
}
