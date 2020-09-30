
import domain.plane.firefighters.Firefighters;
import domain.plane.firefighters.TypeOfExtinguishingAgents;
import domain.plane.freight.Freight;
import domain.plane.freight.TypeOfCargo;
import domain.plane.military.Military;
import domain.plane.military.TypeOfMilitaryPlane;
import domain.plane.passanger.Passenger;
import domain.plane.passanger.TypeOfPassengerPlane;
import domain.plane.postage.Postage;
import domain.plane.postage.TypeOfMail;
import domain.plane.Plane;
import domain.Airline;
import services.plane.comporator.ComparePlaneByRangeOfFlight;
import services.plane.PlaneService;
import services.AirlineService;
import services.CommonService;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AirlineService airlineService = new AirlineService();
        Passenger passenger1 = new Passenger(1000.5,200,2,400,
                150.5,"PROTASIK", TypeOfPassengerPlane.PREMIUM);
        Passenger passenger2 = new Passenger(1000.5,400,2,400,
                150.5,"PROTASIK2", TypeOfPassengerPlane.PREMIUM);
        Airline airline = new Airline();
        airline.planes.add(passenger1);
        airline.planes.add(passenger2);
        double weight = airlineService.weightOfAirline(airline);
        int capacity = airlineService.capacityOfAirline(airline);
        Comparator<Plane> comparator = new ComparePlaneByRangeOfFlight();
        airlineService.sortPlane(airline,comparator);
        System.out.println(airline.planes);
    }

}

