package inter;

public class DriverEx {
    public static void main(String[] args) {

        Driver driver = new Driver();

        driver.dirve(new Taxi());
        driver.dirve(new Bus());

    }
}
