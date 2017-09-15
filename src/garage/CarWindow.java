package garage;

public class CarWindow {

    private boolean window;

    public CarWindow() {
        window = true;
    }

    public CarWindow(boolean window) {
        this.window = window;
    }

    public void openWindow() {
        if (window) {
            System.out.println("The window is open");
        } else {
            System.out.println("Window opened");
        }
    }

    public void closeWindow() {
        if (!window) {
            System.out.println("The window is close");
        } else {
            System.out.println("Window closed");
        }
    }

    public void openOrCloseWindow() {
        if (window) {
            window = true;
            System.out.println("Window opened");
        } else {
            window = false;
            System.out.println("Window closed");
        }

    }

    public void info() {
        System.out.println("Window is " + (window ? "open" : "close"));
    }
}
