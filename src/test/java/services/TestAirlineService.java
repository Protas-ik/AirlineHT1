package services;

import domain.Airline;
import domain.plane.Plane;
import domain.plane.passanger.Passenger;
import domain.plane.passanger.TypeOfPassengerPlane;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.AirlineService;
import services.plane.comporator.ComparePlaneByRangeOfFlight;
import java.util.Comparator;
import java.util.List;

public class TestAirlineService {

    private static Airline airline;
    private static AirlineService airlineService;
    private static Comparator<Plane> comparator;


    @Before
    public void setUp() throws Exception {
        airline = new Airline();
        airlineService = new AirlineService();
        comparator = new ComparePlaneByRangeOfFlight();
        Passenger passenger1 = new Passenger(2000.5,400,10,600,
                100,"PROTASIK", TypeOfPassengerPlane.PUBLIC);
        airline.planes.add(passenger1);
        Passenger passenger2 = new Passenger(1000.5,200,2,400,
                150.5,"PROTASIK2", TypeOfPassengerPlane.PREMIUM);
        airline.planes.add(passenger2);
    }

    @Test
    public void testIsWeightOfAirlineCalculateCorrectly(){
        double totalWeight = airlineService.weightOfAirline(airline);
        Assert.assertEquals(3001,totalWeight,0);
    }

    @Test
    public void testIsCapacityOfAirlineCalculateCorrectly(){
        int totalCapacity = airlineService.capacityOfAirline(airline);
        Assert.assertEquals(1000,totalCapacity);
    }

    @Test
    public void testIsPlaneSortCorrectly(){
        airlineService.sortPlane(airline,comparator);
        Assert.assertEquals(200,airline.planes.get(0).getRangeOfFlight(),0);
    }

    @Test
    public void testIsPlanesFoundCorrectly(){
        List<Plane> foundPlane = airlineService.findPlaneByFuelConsumption(airline,90d,150d);
        Assert.assertEquals(1,foundPlane.size());
    }

}
