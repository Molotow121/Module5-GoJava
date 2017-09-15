package garage;

public class CarDoor {

    private boolean door;

    public CarDoor() {
        door = true;
    }

    public CarDoor(boolean door) {
        this.door = door;
    }

    public void openDoor() {
        if (door) {
            System.out.println("The door is open");
        } else {
            System.out.println("Door opened");
        }
    }

    public void closeDoor() {
        if (!door) {
            System.out.println("The door is close");
        } else {
            System.out.println("Door closed");
        }
    }

    public void openOrCloseDoor() {
        if (door) {
            door = true;
            System.out.println("Door opened");
        } else {
            door = false;
            System.out.println("Door closed");
        }

    }

    public void info() {
        System.out.println("Door is " + (door ? "open" : "close"));
    }
}


