# Dependency Injection without Container

Objects use each other to implement a certain behavior. This
example is about a Car that starts or stops driving. The Car
does have two axles, and the axles have wheels. Axles and
wheels are used in the starting and stopping of the Car as well.

The task is to wire the objects and let the car start driving
and stop driving. Use the
[unit test for class Car](./src/test/java/inc/monster/car/CarTest.java)
as the entry point into the program.

## Task 1

The first use case is the starting of the car. A starting car
should print the following lines to STDOUT.

```
This car is driving
I'm rotating (front axle)
left front wheel is spinning
right front wheel is spinning
I'm rotating (rear axle)
left rear wheel is spinning
right rear wheel is spinning
```

## Task 2

The second use case is the stopping of the car.  The following
lines should be printed to STDOUT.

```
This car is stopping
I'm stopping (front axle)
left front wheel is stopping
right front wheel is stopping
I'm stopping (rear axle)
left rear wheel is stopping
right rear wheel is stopping
```

## Bonus Task

Maybe you wrote glue code in your unit tests to wire the parts
of the car. Use that code and write a _CarFactory_ that constructs
a car. Write a unit test for this new class _CarFactory_.
