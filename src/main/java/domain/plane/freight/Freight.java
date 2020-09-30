package domain.plane.freight;

import domain.plane.Plane;

public class Freight extends Plane {
    private TypeOfCargo typeOfCargo = TypeOfCargo.UNDEFINED;

    public Freight(double weight,double rangeOfFlight, double carryingCapacity, int capacity,
                     double fuelConsumption, String model,TypeOfCargo typeOfCargo){
        super(weight, rangeOfFlight, carryingCapacity, capacity, fuelConsumption, model);
        this.typeOfCargo = typeOfCargo;
    }

    public TypeOfCargo getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(TypeOfCargo typeOfCargo) {
        if (typeOfCargo == null) {
            throw new NullPointerException("typeOfCargo is null");
        }
        this.typeOfCargo = typeOfCargo;
    }

    @Override
    public String toString() {
        return "Freight{" +
                super.toString() +
                " typeOfCargo= " + typeOfCargo +
                '}';
    }

}
