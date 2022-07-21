# Own-Ecommerce
A little project I'll be programming to practice the creation of a API using the Java language, its servlet and the SPRING framework, the REST concepts, and MySQL database.

## PROJECT OVERALL ARCHITECTURE
In this project I'll be using an architecture I saw in one of Nelio's, a teacher who's got a lot of Java courses on Udemy, 331th class. You can see it below.
![Nelio's Architecture](nelios-architecture.jpg)

### Application
The name explains itself.

### Resource Layer (Rest Controllers)
This layer is responsible for receiving the HTTP requests and directing them to the right places. I've noticed that programmers have conventioned to use the word MAP to express the concept of keep track of every piece in a context. For example, let's say the server has some kind of LIST of REQUESTS (for Java programmers it'd be something like List<Requests>), so we would use a Mapping tool to go over each of them to find the ones we need – that's the job of the @{Http Verbs}Mapping annotations, such as @GetMapping.

It's important to say that each Entity has it's own resource class.

### Service Layer
As the name states, in this layer we will code the services the Business provides, such as `getAllClients()`.

It's important to say that each Entity has it's own service class.

### Data Access Layer (Data Repositories)
Here we would use something like the DAO Pattern. In other words, here will be all the methods that interact with the database.

## DATABASE  CONCEPTUAL MODEL
![Conceptual model of the database](/conceptual-model.drawio.svg)
