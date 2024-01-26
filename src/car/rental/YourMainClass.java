package car.rental;

public class YourMainClass {

    public static void main(String[] args) {
        // Initialize and display the Login window
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
