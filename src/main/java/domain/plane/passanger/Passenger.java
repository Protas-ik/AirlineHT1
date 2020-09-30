package domain.plane.passanger;

import domain.plane.Plane;

public class Passenger extends Plane {
    private TypeOfPassengerPlane typeOfPassengerPlane = TypeOfPassengerPlane.UNDEFINED;



    public Passenger(double weight,double rangeOfFlight, double carryingCapacity, int capacity,
                     double fuelConsumption, String model,TypeOfPassengerPlane typeOfPassengerPlane){
        super(weight, rangeOfFlight, carryingCapacity, capacity, fuelConsumption, model);
        this.typeOfPassengerPlane = typeOfPassengerPlane;
    }

    public TypeOfPassengerPlane getTypeOfPassengerPlane() {
        return typeOfPassengerPlane;
    }

    public void setTypeOfPassengerPlane(TypeOfPassengerPlane typeOfPassengerPlane) {
        if (typeOfPassengerPlane == null) {
            throw new NullPointerException("typeOfPassengerPlane is null");
        }
        this.typeOfPassengerPlane = typeOfPassengerPlane;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                super.toString() +
                " typeOfPassengerPlane= " + typeOfPassengerPlane +
                '}';
    }
}
