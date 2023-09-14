package org.launchcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
@Test
    public void emptyTest(){
    assertEquals(10,10,.001);
}
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
    Car test_car =new Car("Toyota", "Prius", 10, 50);
    assertEquals(10,test_car.getGasTankLevel(),0.001);
    assertFalse(test_car.getGasTankLevel()==0);
    assertTrue(test_car.getGasTankLevel() == 10);}
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
    Car test_car =new Car("Toyota", "Prius", 10, 50);
    test_car.drive(50);
    assertEquals(9,test_car.getGasTankLevel(),0.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
        Car test_car =new Car("Toyota", "Prius", 10, 50);
        test_car.drive(510);
        assertEquals(0,test_car.getGasTankLevel(),0.001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void testGasOverfillException(){
        Car test_car =new Car("Toyota", "Prius", 10, 50);
        assertThrows(IllegalArgumentException.class, () ->test_car.addGas(5),"Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}


