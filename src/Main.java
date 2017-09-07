import garage.Car;
import garage.CarDoor;
import garage.CarWheel;
import garage.CarWindow;

public class Main {

    public static void main(String[] args) {
    	//Task 1:
    	CarDoor carDoor = new CarDoor();
    	CarWindow carWindow = new CarWindow();

		carDoor.OpenDoor();
		carDoor.CloseDoor();
		carDoor.OpenOrCloseDoor();
		carDoor.Info();

		System.out.println();

		carWindow.OpenWindow();
		carWindow.CloseWindow();
		carWindow.OpenOrCloseWindow();
		carWindow.Info();

		System.out.println();

		//Task 2:
		CarWheel carWheel = new CarWheel();

		carWheel.statusTireBefore();
		carWheel.frayedTire();
		carWheel.statusTireAfter();
		carWheel.getTireIntegrity();

		System.out.println();

		//Task 3:
		Car Car = new Car();

		Car.CurrentSpeed();
		Car.passengerPlus();
		Car.passengerMinus();
		Car.disembarkAll();
		Car.Door();
		Car.Wheel();
		Car.removeWheels();
		Car.wheelPlus();
		Car.MaxSpeed();
		Car.Info();


	// write your code here
    }
}
