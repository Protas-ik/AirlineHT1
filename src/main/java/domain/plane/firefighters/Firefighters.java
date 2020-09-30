package domain.plane.firefighters;

import domain.plane.Plane;

public class Firefighters extends Plane {
    private TypeOfExtinguishingAgents typeOfExtinguishingAgents = TypeOfExtinguishingAgents.UNDEFINED;

    public Firefighters(){
    }

    public Firefighters(double weight,double rangeOfFlight, double carryingCapacity, int capacity,
                   double fuelConsumption, String model,TypeOfExtinguishingAgents typeOfExtinguishingAgents){
        super(weight, rangeOfFlight, carryingCapacity, capacity, fuelConsumption, model);
        this.typeOfExtinguishingAgents = typeOfExtinguishingAgents;
    }

    public TypeOfExtinguishingAgents getTypeOfExtinguishingAgents(){
        return typeOfExtinguishingAgents;
    }

    public void setTypeOfExtinguishingAgents(TypeOfExtinguishingAgents typeOfExtinguishingAgents){
        if(typeOfExtinguishingAgents == null){
            throw new NullPointerException("TypeOfExtinguishingAgents is null");
        }
        this.typeOfExtinguishingAgents = typeOfExtinguishingAgents;
    }

    @Override
    public String toString() {
        return "Firefighters{" +
                super.toString() +
                " typeOfExtinguishingAgents= " + typeOfExtinguishingAgents +
                '}';
    }

}
