Application information
Created for doing POC using HTML, Angular JS
Repository: GIT
build tool: maven
Technologies: Java 1.8, Spring 4.x with REST controller, spring JDBC, 
DB : MySQL
HTML,ANgular JS

DB details:



Flows: User Registration flow

Access application: URL on web
http://localhost:8080/springangularjsapp/

URL on REST: 
http://localhost:8080/springangularjsapp/resources/user
HTTP POST
REQ Headers: Content-Type:application/json
REQ body:
{"firstName":"firstName",
"lastName":"lastName",
"gender":"Male",
"addresses":[{"area":"chanda nagar","city":"Hyderabad"}	,{"area":"Kharadi","city":"Pune"}]
}