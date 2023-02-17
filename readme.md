This is a Railway Reservation System created by my team as part of the Database Management Systems Lab.
The project uses java swing for its front end along with java and jdbc in its backend.

Instructions:

1. First install MySQL from https://dev.mysql.com/downloads/windows/installer/8.0.html
2. While installing set the port number as 3306 and password as 'password'. If it was not set then go to src/railway, open all .java files and replace all instances of ("jdbc:mysql://localhost:3306/trains","root","password") with ("jdbc:mysql://localhost:<your port number>/trains","root","<your password>")
3. Open the MySQL Workbench 8.0 CE and select the local instance with the port number you selected from MySQL Connections and provide your password.
4. Go to File>Open SQL Script... and select the train.sql file provided in the repository.
5. Click the lightning bolt sign (3rd icon that says "Execute the selected portion of the script or everything, if there is no selection")
6. Now run dist/railways and register as a new user.
