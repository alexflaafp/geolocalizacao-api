# geolocalizacao-api

# Considerations
   • The application is configured to run on port 8088
   
   • The application use an in memory DB - H2 Database
   
   • The application was developed using Spring Boot. This is a stand alone application where everything you need is embedded on it (Tomcat, DB, ...)
   
   • The application will populate the DB with 10000 records previously generated

  
o	https://github.com/hyalen-moreira/inauth/blob/master/src/main/java/us/hyalen/inauth/util/Utils.java
•	I'm using the Google Maps API to get information from given coordinates
o	https://github.com/hyalen-moreira/inauth/tree/master/src/main/java/us/hyalen/inauth/connection
•	In case you prefer to clone the repository, build and run by yourself, instead of execute the .jar file, you will need a Google Maps API key
o	To get a Google Maps API key
	https://developers.google.com/maps/documentation/geocoding/get-api-key
o	To set a key in the app
	https://github.com/hyalen-moreira/inauth/blob/master/src/main/java/us/hyalen/inauth/connection/GoogleMapsApi.java
To execute the app
•	java -jar inauth-0.0.1-SNAPSHOT.jar
•	I've sent the .jar file to your email
To see the Java Code
Clone the GitHub project https://github.com/hyalen-moreira/inauth.git
To see the seed data
https://github.com/hyalen-moreira/inauth/blob/master/src/main/resources/data-h2.sql
To test the endpoints
Once the application is running, open a browser of your choice and:
•	To get all coordinates - GET
o	http://localhost:8088/inauth/api/locations
•	To get data from a specific coordinate - GET
o	http://localhost:8088/inauth/api/locations/40.714224,-73.961452
o	If the coordinate doens't exist in the DB, the app will return 404 - No Found
o	Otherwise the application will access a Google Maps API and will return information about the coordinate
•	To add a new coordinate - POST
o	http://localhost:8088/inauth/api/locations
o	Inform the latitude and longitude on body of the http post request
o	{"latitude" : "42.714224", "longitude" : "-53.961452"}
