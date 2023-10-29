import hw_2.Car;
import hw_2.Motorcycle;
import hw_2.Vehicle;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;


public class VehicleTest {

    /*
     Домашнее задание к семинару №2 JUnit:
     1. Настроить новый проект:
         a). Нужно создать новый проект, со следующей структурой классов (3 отдельных класса):

         b). Настроить тестовую среду
             (создать тестовый класс VehicleTest, пометить папку как Test sources (зеленая папка),
             импортировать необходимые для тестов библиотеки (JUnit, assertJ - все что было на семинаре))

         c). Написать следующие тесты:
             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
             - проверка того, объект Car создается с 4-мя колесами
             - проверка того, объект Motorcycle создается с 2-мя колесами
             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    */


    @Test
    public void testInstanceOfVehicle() {
        Car car = new Car("Toyota", "Soarer", 1989);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    public void testNumberOfCarWheels() {
        Car car = new Car("Toyota", "Soarer", 1989);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testNumberOfMotorcycleWheels() {
        Motorcycle motorcycle = new Motorcycle("Brough Superior", "SS100", 1935);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Soarer", 1989);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Brough Superior", "SS100", 1935);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarSpeedParking() {
        Car car = new Car("Toyota", "Soarer", 1989);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcycleSpeedParking() {
        Motorcycle motorcycle = new Motorcycle("Brough Superior", "SS100", 1935);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
