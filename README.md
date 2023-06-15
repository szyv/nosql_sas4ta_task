# nosql_sas4ta_task

mvn spring-boot:run - to run app
mongodb on 27017 is required (docker pull mongo ; docker run --name mongodb -p 27017:27017 -d mongo)
http://localhost:8080/api/base - get all from db
http://localhost:8080/api/upload - post PGN data to DB
