# Building a Movie Database Web Application with Vaadin: Integrating Python, MySQL, and JDBC

The aim of this project was to become familiar with the workflow of an application that utilizes the Vaadin framework for rendering web layouts. In this particular project, we needed to call a Python script from a Java Vaadin application.

The Python script had a specific task: to extract content from a raw dataset in CSV format and store the retrieved content in a MySQL database. This step involved processing the dataset and extracting relevant information such as movie titles, descriptions, and other related data.

Once the content was successfully stored in the MySQL database, we utilized a JDBC connector to establish a connection between the Java Vaadin application and the database. This connection allowed us to fetch the content from the database and display it on the Vaadin frontend application.

The main purpose of the Vaadin frontend application was to present the content of all the movies present in the MySQL database. This was achieved by retrieving the relevant information from the database and rendering it in an organized and visually appealing manner on the Vaadin web interface.

Overall, this project provided an opportunity to understand the integration of different technologies, such as Vaadin, Python, MySQL, and JDBC, in order to create a web application that extracts and displays movie data from a dataset. It allowed for the exploration of the Vaadin framework's capabilities in combination with other technologies to create a functional and user-friendly web application.