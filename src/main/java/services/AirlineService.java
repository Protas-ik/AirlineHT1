package services;

import domain.Airline;
import domain.exeption.AppException;
import domain.exeption.Messages;
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

    public void addPlane(Airline airline, Plane plane) {
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

    public double weightOfAirline(Airline airline) throws AppException {
        try{
            PlaneService planeService = new PlaneService();
            double weightOfAirline = planeService.weightOfAirline(airline.getPlanes());
            return weightOfAirline;
        } catch ( Exception e){
            LOG.warn("Airline is null");
            throw new AppException(Messages.ERR_CANNOT_TAKE_AIRLANE,e);
        }
    }

    public int capacityOfAirline(Airline airline) throws AppException {
        try{
            PlaneService planeService = new PlaneService();
            int capacityOfAirline = planeService.capacityOfAirline(airline.getPlanes());
            return capacityOfAirline;
        } catch ( Exception e){
            LOG.warn("Airline is null");
            throw new AppException(Messages.ERR_CANNOT_TAKE_AIRLANE,e);
        }
    }

    public void sortPlane(Airline airline, Comparator<Plane> comparator) throws AppException{
        try{
            CommonService commonService = new CommonService();
            commonService.sort(airline.getPlanes(), comparator);
        } catch ( Exception e){
            LOG.warn("Airline is null");
            throw new AppException(Messages.ERR_CANNOT_TAKE_AIRLANE,e);
        }
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

