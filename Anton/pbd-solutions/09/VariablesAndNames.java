public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
//this puts in the value of the variable into the printed statement
        System.out.println( "There are only " + drivers + " drivers available." );
//this puts in the the value of the variable
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
//
        System.out.println( "We can transport " + carpool_capacity + " people today." );
//this performs the function in the variable and then  
        System.out.println( "We have " + passengers + " to carpool today." );
//this places the variable's value into the printed statement  
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
//this does the function of passengers value divided by cars_driven value and then adds the result
  }
}
