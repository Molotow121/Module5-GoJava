package garage;

public class CarWindow {

    private boolean window;

    public CarWindow() {
        window = true;
    }

    public CarWindow(boolean window) {
        this.window = window;
    }

    public void OpenWindow() {
        if (window) {
            System.out.println("The window is open");
        } else {
            System.out.println("Window opened");
        }
    }

    public void CloseWindow() {
        if (!window) {
            System.out.println("The window is close");
        } else {
            System.out.println("Window closed");
        }
    }

    public void OpenOrCloseWindow() {
        if (window) {
            window = true;
            System.out.println("Window opened");
        } else {
            window = false;
            System.out.println("Window closed");
        }

    }

    public void Info() {
        System.out.println("Window is " + (window ? "open" : "close"));
    }
}
