import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.Motorcycle;

public class MotorcycleTest {
    private Motorcycle motorcycle;

    // - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycleIsCreatedWith2Wheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "7", 2022);
        int wheelNumber = 2;
        assertEquals(motorcycle.getNumWheels(), wheelNumber, "Incorrect number of wheels in the motorcycle");
    }

    // - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового
    // вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleReachSpeed75InTestDriving() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "7", 2022);
        int expectedTestDriveSpeed = 75;

        motorcycle.testDrive();
        int factTestDriveSpeed = motorcycle.getSpeed();

        assertEquals(factTestDriveSpeed, expectedTestDriveSpeed,
                "Incorrect speed of the motorcycle in test drive mode");
    }

    // - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcycleSpeed0WhenCarIsParked() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "7", 2022);
        int expectedParkingSpeed = 0;

        motorcycle.testDrive();
        motorcycle.park();
        int factTestParkingSpeed = motorcycle.getSpeed();

        assertEquals(factTestParkingSpeed, expectedParkingSpeed, "Incorrect speed of the motorcycle in park mode");
    }
}
