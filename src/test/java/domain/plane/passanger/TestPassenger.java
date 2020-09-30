package domain.plane.passanger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPassenger {

    private static Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger(2000.5,400,10,600,
                100,"PROTASIK", TypeOfPassengerPlane.PUBLIC);
    }

    @Test
    public void testGetTypeOfPassengerPlane(){
        Assert.assertEquals(TypeOfPassengerPlane.PUBLIC,passenger.getTypeOfPassengerPlane());
    }

    @Test
    public void testSetTypeOfPassengerPlane(){
        Assert.assertNotNull(passenger);
        passenger.setTypeOfPassengerPlane(TypeOfPassengerPlane.PREMIUM);
        Assert.assertEquals(passenger.getTypeOfPassengerPlane(), TypeOfPassengerPlane.PREMIUM);
    }

}