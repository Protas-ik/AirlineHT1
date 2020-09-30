package services.plane;

import domain.plane.Plane;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class PlaneService {

    public static final Logger LOG =Logger.getLogger(PlaneService.class);

    public PlaneService(){
    }

    public double weightOfAirline(List<Plane> planes) {
        if(planes == null){
            LOG.warn("List of plane is null");
            throw new NullPointerException("List of planes is null");
        }
        LOG.log(Level.DEBUG,"List<Plane> planes: " + planes);
        double totalWeight = 0d;
        for (Plane i : planes) {
            totalWeight += i.getWeight();
        }
        LOG.debug(totalWeight);
        return totalWeight;
    }

    public int capacityOfAirline(List<Plane> planes) {
        if(planes == null){
            LOG.warn("List of plane is null");
            throw new NullPointerException("List of planes is null");
        }
        LOG.log(Level.DEBUG,"List<Plane> planes: "+ planes);
        int totalCapacity=0;
        for (Plane i : planes) {
            totalCapacity += i.getCapacity();
        }
        LOG.debug(totalCapacity);
        return totalCapacity;
    }

    public List<Plane> findPlaneByFuelConsumption(List<Plane> planes, double minFuelConsumption, double maxFuelConsumption){
        if(planes == null){
            LOG.warn("List of plane is null");
            throw new NullPointerException("List of planes is null");
        }
        LOG.log(Level.DEBUG,"List<Plane> planes: " + planes);
        List<Plane> foundAirplanes = new ArrayList<Plane>();
        for (Plane i : planes) {
            double fuelConsumption = i.getFuelConsumption();
            if (fuelConsumption >= minFuelConsumption && fuelConsumption <= maxFuelConsumption) {
                foundAirplanes.add(i);
            }
        }
        LOG.log(Level.DEBUG,"List<Plane> foundAirplanes: "+ foundAirplanes);
        return foundAirplanes;
    }

}
