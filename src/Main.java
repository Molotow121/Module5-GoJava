import garage.*;

public class Main {

    public static void main(String[] args) {
    	//Task 1:
    	CarDoor carDoor = new CarDoor();
    	CarWindow carWindow = new CarWindow();

		carDoor.openDoor();
		carDoor.closeDoor();
		carDoor.openOrCloseDoor();
		carDoor.info();

		System.out.println();

		carWindow.openWindow();
		carWindow.closeWindow();
		carWindow.openOrCloseWindow();
		carWindow.info();

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
		Car.door();
		Car.wheel();
		Car.removeWheels();
		Car.wheelPlus();
		Car.maxSpeed();
		Car.info();

		System.out.println();
		Interface.main();


	// write your code here
    }
}
