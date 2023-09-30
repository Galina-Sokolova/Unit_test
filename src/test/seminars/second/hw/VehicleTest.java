package seminars.second.hw;

import Seminar.second.hw.Car;
import Seminar.second.hw.Motorcycle;
import Seminar.second.hw.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Audi", "100", 1990);
        motorcycle = new Motorcycle("Harley-Davidson", "Sportster 883 Low 2010", 2010);
    }
    // проверка, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    // проверка, что объект Car создается с 4-мя колесами
    @Test
    public void testCarHaveFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // проверка, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotoHaveTwoWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }


    // проверка, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarHaveSpeedInTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // проверка, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotoHaveSpeedInTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // проверка, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testCarStopPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // проверка, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void testMotoStopPark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
