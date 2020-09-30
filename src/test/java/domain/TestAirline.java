package domain;

import domain.Airline;
import domain.plane.Plane;
import domain.plane.passanger.Passenger;
import domain.plane.passanger.TypeOfPassengerPlane;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class TestAirline {

    private static Airline airline;
    private static List<Plane> samolet;
    private static List<Plane> aircraft;


    @Before
    public void setUp() throws Exception{
        airline = new Airline();
        samolet = new ArrayList<Plane>();
        aircraft = new ArrayList<Plane>();
        airline.setName("Protas");
        Passenger passenger1 = new Passenger(2000.5,400,10,600,
                100,"PROTASIK", TypeOfPassengerPlane.PUBLIC);
        airline.planes.add(passenger1);
        Passenger passenger2 = new Passenger(1000.5,200,2,400,
                150.5,"PROTASIK2", TypeOfPassengerPlane.PREMIUM);
        airline.planes.add(passenger2);
        aircraft.add(passenger1);
        samolet.add(passenger1);
        samolet.add(passenger2);
    }

    @Test
    public void testGetName() {
        Assert.assertSame("Protas",airline.getName());
    }

    @Test
    public void testSetName() {
        airline.setName("PROTAS12");
        Assert.assertSame("PROTAS12",airline.getName());
    }

    @Test
    public void testGetPlanes() {
        Assert.assertEquals(samolet,airline.getPlanes());
    }

    @Test
    public void testSetPlanes() {
        airline.setPlanes(aircraft);
        Assert.assertEquals(aircraft,airline.getPlanes());
    }

}
