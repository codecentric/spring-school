# With Dependency Injection 

After we wired the Car example by hand, now we want to use Spring DI to wire our objects.
Use _@Component_ and _@Autowired_ annotation to configure your objects.

## Task 1
First use case should be that if the car starts driving the following println() are printed to STDOUT.

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
Second use case should be that if the car stops driving the following println() are printed to STDOUT.
 
```
This car is stopping
I'm stopping (front axle)
left front wheel is stopping
right front wheel is stopping  
I'm stopping (rear axle)
left rear wheel is stopping
right rear wheel is stopping
```

## Task 3
Maybe you wrote glue code in your unit tests to wire the parts of the car. Use that code and write a 
_CarFactory_ that constructs a car. Write a unit test for this _CarFactory_.

