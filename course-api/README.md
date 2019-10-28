this api is a sample rest api using springboot to start with a crud operations,
notice that, in this project we don't use database to read data , so as a first issue 
we will prepare some data in java , as java list 
so, to test the project , you have to import it on your tool:
you can use:
 - either eclipse or sts
 -requiered jdk 1.8......
 -maven 5.3.....
Fist you have to clone the project in specific repository ,and then
import it in sts/eclipse as mave project.
Once the project is imported , you have to run the project with the following commands: 
 1- maven clean
 2- maven install
 3- run as springboot application
when the project is deployed so you can test with your browser : 
  http://[your-server-adress]:port/topic   => get all the existing topics 
  http://[your-server-adress]:port/topic/{your-id} => get a specified topic with its id
  
  
  for me it's : "http://localhost:8080/topics"
 