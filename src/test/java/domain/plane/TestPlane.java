package domain.plane;

import domain.plane.passanger.Passenger;
import domain.plane.passanger.TypeOfPassengerPlane;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPlane {

    private static Plane plane;

    @Before
    public void setUp() throws Exception{
      plane = new Passenger(2000.5,400,10,600,
              100,"PROTASIK", TypeOfPassengerPlane.PUBLIC);
    }

    @Test
    public void getWeight() {
        Assert.assertEquals(2000.5,plane.getWeight(),0);
    }

    @Test
    public void setWeight() {
        plane.setWeight(1000.5);
        Assert.assertEquals(1000.5,plane.getWeight(),0);
    }

    @Test
    public void getRangeOfFlight() {
        Assert.assertEquals(400,plane.getRangeOfFlight(),0);
    }

    @Test
    public void setRangeOfFlight() {
        plane.setRangeOfFlight(300);
        Assert.assertEquals(300,plane.getRangeOfFlight(),0);
    }

    @Test
    public void getCarryingCapacity() {
        Assert.assertEquals(10,plane.getCarryingCapacity(),0);
    }

    @Test
    public void setCarryingCapacity() {
        plane.setCarryingCapacity(11);
        Assert.assertEquals(11,plane.getCarryingCapacity(),0);
    }

    @Test
    public void getCapacity() {
        Assert.assertEquals(600,plane.getCapacity());
    }

    @Test
    public void setCapacity() {
        plane.setCapacity(700);
        Assert.assertEquals(700,plane.getCapacity());
    }

    @Test
    public void getFuelConsumption() {
        Assert.assertEquals(100,plane.getFuelConsumption(),0);
    }

    @Test
    public void setFuelConsumption() {
        plane.setFuelConsumption(110);
        Assert.assertEquals(110,plane.getFuelConsumption(),0);
    }

    @Test
    public void getModel() {
        Assert.assertEquals("PROTASIK",plane.getModel());
    }

    @Test
    public void setModel() {
        plane.setModel("PROTASIK1");
        Assert.assertEquals("PROTASIK1",plane.getModel());

    }

}