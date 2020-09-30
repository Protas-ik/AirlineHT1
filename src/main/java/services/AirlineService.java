package services;

import domain.Airline;
import domain.plane.Plane;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import services.plane.PlaneService;

import java.util.Comparator;
import java.util.List;

public class AirlineService<plane> {

    public static final Logger LOG = Logger.getLogger(AirlineService.class.getName());

    public AirlineService(){
    }

    public void addPlane(Airline airline, Plane plane){
        if(plane == null){
            LOG.warn("plane is null");
            throw new NullPointerException("plane is null");
        }
        if(airline == null){
            LOG.warn("airline is null");
            throw new NullPointerException("airline is null");
        }
        CommonService commonService = new CommonService();
        commonService.add(airline.getPlanes(),plane);
    }

    public double weightOfAirline(Airline airline){
        if (airline == null) {
            LOG.warn("Airline is null");
            throw new NullPointerException("Airline is null");
        }
        PlaneService planeService = new PlaneService();
        double weightOfAirline = planeService.weightOfAirline(airline.getPlanes());
        return weightOfAirline;
    }

    public int capacityOfAirline(Airline airline){
        if (airline == null) {
            LOG.warn("Airline is null");
            throw new NullPointerException("Airline is null");
        }
        PlaneService planeService = new PlaneService();
        int capacityOfAirline = planeService.capacityOfAirline(airline.getPlanes());
        return capacityOfAirline;
    }

    public void sortPlane(Airline airline, Comparator<Plane> comparator){
        if (airline == null) {
            LOG.warn("Airline is null");
            throw new NullPointerException("Airline is null");
        }
        CommonService commonService = new CommonService();
        commonService.sort(airline.getPlanes(), comparator);
    }

    public List<Plane> findPlaneByFuelConsumption(Airline airline, Double minFuelConsumption, Double maxFuelConsumption){
        LOG.log(Level.DEBUG,"minSpeed: " + minFuelConsumption.toString()+" maxSpeed: " + maxFuelConsumption.toString());
        if (airline == null) {
            LOG.warn("Airline is null");
            throw new NullPointerException("Airline is null");
        }
        if (minFuelConsumption < 0 || maxFuelConsumption < 0) {
            LOG.warn("Negative consumption");
            throw new IllegalArgumentException("Negative consumption");
        }
        PlaneService planeService = new PlaneService();
        List<Plane> foundAirplanes = planeService.findPlaneByFuelConsumption(airline.getPlanes(), minFuelConsumption, maxFuelConsumption);
        return foundAirplanes;
    }

}

