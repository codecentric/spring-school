# Spring Boot MVC - CRUD Customer Assignment

The goal is to extend the existing application which handles
products to also support customers.

A customer (a company) has a name, an email address of the
PR department, and a number of employees.

It should be possible to list, add, edit and delete customers.

## Task

Create a Customer domain object. The object has to contain the
attributes mentioned above. Choose the correct types for the
properties. The fields should be private and have getters and
setters. Use your IDE to generate the code.

Add an id value to your customer object. The id should be an
Integer and have a getter and setter.

Create a customer service. Use an interface, create an
implementation like we did for the product service.

Create a controller. Implement the ability to list, show
one customer, add a customer, update a customer, and delete
a customer by id.

Create the corresponding Thymeleaf templates.

At the end of this module you should have a working web
application which will allow you to do CRUD operations on a
customer object.

## Bonus Task 1

The properties of the customer should be validated. The name
and the email address is required. The number of employees is
optional but should be >1 when given.

Check that the validation are checked both for creation and
update.

## Bonus Task 2

There is a lot of similar code between the product and the
customer packages. Which code can be removed? Remove the
duplication.

## Bonus Task 3

All the pages use the same <head> tag except for the <title> inside.
Is there a possibility to extract this common template?
