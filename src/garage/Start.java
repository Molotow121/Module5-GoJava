package garage;

import java.util.Scanner;

public class Start {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        CarDoor carDoor = new CarDoor();
        CarWindow carWindow = new CarWindow();
        CarWheel carWheel = new CarWheel();
        Car Car = new Car();

        System.out.println("Welcome! ");
        System.out.println();
        System.out.println("Now you will be shown the possibilities of a new car model Tesla-X.");
        System.out.println("Please, specify transaction number.");
        System.out.println("Open the door - click 1,\nClose the door - click 2,\n" +
                "Change the position of the door - click 3, \nOpen window - click 4,\n" +
                "Close window - click 5,\nChange the position of the window - click 6,\n" +
                "Change the tire on new - click 7,\nExploit tire on X% - click 8,\n" +
                "Status of tire - click 9,\nChange the current speed - click 10,\n" +
                "Put one passenger in a car - click 11,\nDisembark one passenger from the car - click 12,\n" +
                "Disembark all passengers - click 13,\n" +
                "Get the door by index - click 14,\nGet the wheel by index - click 15,\n" +
                "Remove the wheel from the car - click 16,\n" +
                "Install the new tire - click 17,\n" +
                "Calculate current max speed - click 18");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                carDoor.openDoor();
                break;
            case 2:
                carDoor.closeDoor();
                break;
            case 3:
                carDoor.openOrCloseDoor();
                break;
            case 4:
                carWindow.openWindow();
                break;
            case 5:
                carWindow.closeWindow();
                break;
            case 6:
                carWindow.openOrCloseWindow();
                break;
            case 7:
                Car.wheelPlus();
                break;
            case 8:
                carWheel.frayedTire();
                break;
            case 9:
                carWheel.statusTireAfter();
                break;
            case 10:
                Car.CurrentSpeed();
                break;
            case 11:
                Car.passengerPlus();
                break;
            case 12:
                Car.passengerMinus();
                break;
            case 13:
                Car.disembarkAll();
                break;
            case 14:
                Car.door();
                break;
            case 15:
                Car.wheel();
                break;
            case 16:
                Car.removeWheels();
                break;
            case 17:
                Car.wheelPlus();
                break;
            case 18:
                Car.CurrentSpeed();
                break;
        }

        System.out.println("Do you want see another information?");
        Scanner s = new Scanner(System.in);
        String num1 = s.next();
        if (num1.equals("Yes")) {
            main();
        }
    }
}