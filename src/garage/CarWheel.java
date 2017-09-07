package garage;

public class CarWheel {
    private double tireIntegrity;

    public CarWheel() {
        tireIntegrity = 1;
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    public CarWheel(double tireIntegrity) {
        this.tireIntegrity = tireIntegrity;
    }

    public void statusTireBefore() {
        System.out.println("Status of tire before frayed: " + tireIntegrity);
    }

    public void frayedTire() {
        if (tireIntegrity > 0) {
            double frayed = Math.random() * 1;
            tireIntegrity = frayed;
            if (tireIntegrity >= 0) {
                System.out.println("Status of tire " + tireIntegrity);
            } else {
                int frayedTire = (int) (tireIntegrity * 10);
                System.out.println("The tire frayed: " + frayedTire + "%");
                tireIntegrity = 0;
            }

        }
    }

    public void statusTireAfter() {
        System.out.println("Status of tire after frayed: " + tireIntegrity);

    }
}