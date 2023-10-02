
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.Car;
import com.example.Vehicle;

public class CarTest {
    private Car car;

    // - Проверить, что экземпляр объекта Car также является экземпляром
    // транспортного средства (используя оператор instanceof).
    @Test
    public void testObjectCarIsExampleOfVehicle() {
        Car car = new Car("BMW", "X5", 2020);
        assertTrue(car instanceof Vehicle, "Incorrect example of class Vehicle");
    }

    // - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarIsCreatedWith4Wheels() {
        Car car = new Car("BMW", "X5", 2020);
        int wheelNumber = 4;
        assertEquals(car.getNumWheels(), wheelNumber, "Incorrect number of wheels in the car");
    }

    // - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    // (используя метод testDrive()).
    @Test
    public void testCarReachSpeed60InTestDriving() {
        Car car = new Car("BMW", "X5", 2020);
        int expectedTestDriveSpeed = 60;

        car.testDrive();
        int factTestDriveSpeed = car.getSpeed();

        assertEquals(factTestDriveSpeed, expectedTestDriveSpeed, "Incorrect speed of the car in test drive mode");
    }

    // - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarSpeed0WhenCarIsParked() {
        Car car = new Car("BMW", "X5", 2020);
        int expectedParkingSpeed = 0;

        car.testDrive();
        car.park();
        int factTestParkingSpeed = car.getSpeed();

        assertEquals(factTestParkingSpeed, expectedParkingSpeed, "Incorrect speed of the car in park mode");
    }
}
