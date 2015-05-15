Introduction
============

This project is a trial of a couple of technologies:

* [Spring Boot](http://projects.spring.io/spring-boot/)
* [Spring Data Rest](http://projects.spring.io/spring-data-rest/) (leverages [Spring HATEOAS](http://projects.spring.io/spring-hateoas/) to expose a RESTful interface on top of [Spring Data](http://projects.spring.io/spring-data/))
* [HSQL](http://hsqldb.org/)

Build and run
=============

To build the project, type `gradlew` in the root folder. Running it is equally simple: `gradlew run`. After that, the server is accessible through the following URLs:

* http://localhost:8080/products lists all available products
* http://localhost:8080/orders lists all available orders

Initially, your database (stored as `database` in folder where you run the project) will be empty. To create a new product, do an HTTP `POST` like this:
```JSON
{
	"productName":"Shoes"
}
```
on the URL http://localhost:8080/products using ``Content-Type:application/json``. This product will be assigned the ID 1. You can `GET` it from http://localhost:8080/products/1.

To order a pair of shoes, `POST` the following to http://localhost:8080/orders:
```JSON
{
   "quantity":2,
   "customerName":"Myself",
   "shippingAddress":"My home",
   "product": "http://localhost:8080/products/1"
}
```

Hope you enjoy it.
