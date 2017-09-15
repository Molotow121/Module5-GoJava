package garage;

import java.util.ArrayList;

public class Car {
    final String createDate;
    private String engine;
    private int maxSpeed;
    private int acceleration;
    private int passengerCapacity;
    private int passengerIn;
    private int currentSpeed;
    ArrayList<CarWheel> wheels;
    int[] doors;

    public Car() {
        createDate = "31.03.2016";
        engine = "electric motor";
        maxSpeed = 225;
        acceleration = 5;
        passengerCapacity = 5;
        passengerIn = (int) (Math.random() * 5);
        currentSpeed = (int) (Math.random() * maxSpeed);
        wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new CarWheel());
        }
        doors = new int[4];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = i + 1;
        }
    }

    public Car(String createDate, String engine, int maxSpeed,
               int acceleration, int passengerCapacity, int passengerIn, int currentSpeed) {
        this.createDate = createDate;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.passengerCapacity = passengerCapacity;
        this.passengerIn = passengerIn;
        this.currentSpeed = currentSpeed;
    }

    public void CurrentSpeed() {
        if (passengerIn == 0) {
            System.out.println("The car does not go without a driver");
        } else {
            System.out.println("Current speed is " + (currentSpeed = (int) (Math.random() * maxSpeed)) + " km/h");
        }
    }

    public void passengerPlus() {
        System.out.println("Plus one more passenger " + (passengerIn + 1));
    }

    public void passengerMinus() {
        if (passengerIn == 0) {
            System.out.println("The car is empty");
        } else {
            System.out.println("Minus one more passenger " + (passengerIn--));
        }
    }

    public void disembarkAll() {
        System.out.println("Disembark everyone out the car " + 0);
    }

    public void door() {
        int Door = doors[(int) (Math.random() * 4)];
        System.out.println("Door number " + Door);
    }

    public void wheel(){
        int Wheel = (int)Math.floor (Math.random() * wheels.size());
        System.out.println("Wheel number " + Wheel);
    }


    public void removeWheels() {
        wheels.clear();
        System.out.println("Remove the wheel from the car " + wheels.size());
    }

    public void wheelPlus() {
        int wheel = wheels.size() + (int) (Math.random() * 4);
        for (int i = 0; i < wheel; i++) {
            wheels.add(new CarWheel());
        }
        System.out.println("Plus " + wheels.size() + " new wheels");
    }

    public void maxSpeed() {
        CarWheel carWheel = new CarWheel();
        if (this.passengerIn > 0 && carWheel.getTireIntegrity() > 0) {
            double speed = maxSpeed * (wheels.get(0).getTireIntegrity());
            System.out.println("Max possible speed: " + speed);
        } else
            System.out.println("The car is empty");
    }

    public void info(){
        System.out.println();
        System.out.println("INFORMATION OF CAR:");
        System.out.println("Create date of car: " + createDate);
        System.out.println("Engine's type: " + engine);
        System.out.println("Max. speed of car: " + maxSpeed);
        System.out.println("Acceleration time to 100 km/h: " + acceleration);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of passengers inside the car at the moment: " + passengerIn);
        System.out.println("Current speed: " + currentSpeed);

    }
}