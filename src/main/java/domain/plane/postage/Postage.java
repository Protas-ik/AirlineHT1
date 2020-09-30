package domain.plane.postage;

import domain.plane.Plane;

public class Postage extends Plane {
    private TypeOfMail typeOfMail = TypeOfMail.UNDEFINED;

    public Postage(){
    }

    public Postage(double weight,double rangeOfFlight, double carryingCapacity, int capacity,
                    double fuelConsumption, String model,TypeOfMail typeOfMail){
        super(weight, rangeOfFlight, carryingCapacity, capacity, fuelConsumption, model);
        this.typeOfMail = typeOfMail;
    }

    public TypeOfMail getTypeOfMail() {
        return typeOfMail;
    }

    public void setTypeOfMail(TypeOfMail typeOfMail) {
        if(typeOfMail == null){
            throw new NullPointerException("TypeOfMail is null");
        }
        this.typeOfMail = typeOfMail;
    }

    @Override
    public String toString() {
        return "Postage{" +
                super.toString() +
                " typeOfMail= " + typeOfMail +
                '}';
    }

}
