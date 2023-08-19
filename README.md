# MVC Design Pattern

The **MVC (Model-View-Controller)** design pattern is a fundamental architectural pattern for building web applications. It divides the web layer
into three distinct components, each with its own responsibility, ensuring a clean and organized structure for your application.

## Components of MVC

### Model

The Model represents the core of your application. It encapsulates the application's data, logic, and state. In simpler terms, it's like the 
brain of your application. Here's what the Model does:

- **Data Management**: It holds and manages the application's data, often in the form of objects or Java POJOs (Plain Old Java Objects).

- **Business Logic**: The Model contains the business logic that dictates how data is processed and manipulated. It can perform tasks like data
  validation, calculations, and more.

- **Updating the Controller**: In some cases, the Model may notify the Controller if its data changes. This allows for real-time updates to the
 user interface.

### View

The View is responsible for rendering the Model's data and presenting it to the end user. It deals with the user interface and how data is 
displayed. Key points about the View include:

- **Displaying Data**: The View takes the data from the Model and presents it to the user. In web applications, this often means generating HTML
   or other output formats.

### Controller

The Controller acts as a mediator between the Model and the View. It handles user requests, decides which Model should process the request, and 
selects the appropriate View to display the results. Key functions of the Controller include:

- **Request Handling**: The Controller receives and manages user requests, typically through user interactions like clicking buttons or
  submitting forms.

- **Selecting the Model**: It determines which Model should be invoked to handle a specific request based on the user's input.

- **View Selection**: After the Model processes the request, the Controller selects the appropriate View to display the results.

## Project Overview

This GitHub project demonstrates the implementation of the MVC design pattern in a simple use case: calculating the average of two numbers.

Here's how the flow of this project works:

1. **User Interaction**: It all begins with `numbers.html`, where the end user can submit two numbers.

2. **Controller**: The submitted request is received and managed by `AverageController.java`, which serves as a servlet. This controller extracts
3.  the parameters (e.g., numbers) from the request.

4. **Model**: The Model class, `AverageCalculator.java`, is responsible for the business logic. It contains a method that calculates and returns
5. the average of two double datatype numbers.

6. **Model Execution**: The Model processes the data and returns the result to the Controller.

7. **View Selection**: The Controller determines which View should be used to present the results and invokes `result.jsp`.

8. **User Interface**: `result.jsp` is responsible for displaying the calculated results to the end user.

This project serves as a practical example of how the MVC pattern works in a web application. It demonstrates the separation of concerns 
between Model, View, and Controller, leading to a clean and maintainable codebase. Feel free to explore the code and use this pattern as a
foundation for your own web development projects.
