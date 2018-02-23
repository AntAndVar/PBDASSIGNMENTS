//4.0 turns the number into a floating point. I do not believe this is necessary here since no decimals will be in any of the equations with the variables

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInCar, carpoolCapacity, averagePassengersPerCar;

        cars = 100;
        //cars is now 100  
        spaceInCar = 4.0;
        //spaceInCar is now equal to 4
        drivers = 30;
        //drivers is now equal to 30
        passengers = 90;
        //passengers is now equal to 90
        carsNotDriven = cars - drivers;
        //carsNotDriven is now 100 - 30
        carsDriven = drivers;
        //carsDriven is now 30
        carpoolCapacity = carsDriven * spaceInCar;
        //carpoolCapacity is now 120
        averagePassengersPerCar = passengers / carsDriven;
        //averagePassengersPerCar is now 3


        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
