package domain.plane.military;

import domain.plane.Plane;

public class Military extends Plane {
    private double weaponCaliber = 0;
    private TypeOfMilitaryPlane typeOfMilitaryPlane = TypeOfMilitaryPlane.UNDEFINED;

    public Military(){
    }

    public Military(double weight,double rangeOfFlight, double carryingCapacity, int capacity,
                   double fuelConsumption, String model,double weaponCaliber,TypeOfMilitaryPlane typeOfMilitaryPlane){
        super(weight, rangeOfFlight, carryingCapacity, capacity, fuelConsumption, model);
        this.weaponCaliber = weaponCaliber;
        this.typeOfMilitaryPlane = typeOfMilitaryPlane;
    }

    public double getWeaponCaliber() {
        return weaponCaliber;
    }

    public void setWeaponCaliber(double weaponCaliber) {
        if (Double.compare(weaponCaliber, 0d) == -1) {
            throw new IllegalArgumentException("Weapon caliber is not valid");
        }
        this.weaponCaliber = weaponCaliber;
    }

    public TypeOfMilitaryPlane getTypeOfMilitaryPlane() {
        return typeOfMilitaryPlane;
    }

    public void setTypeOfMilitaryPlane(TypeOfMilitaryPlane typeOfMilitaryPlane) {
        if (typeOfMilitaryPlane == null) {
            throw new NullPointerException("Type Of Military Plane is null");
        }
        this.typeOfMilitaryPlane = typeOfMilitaryPlane;
    }

    @Override
    public String toString() {
        return "Military{" +
                super.toString() +
                " weaponCaliber= " + weaponCaliber +
                ", typeOfPlane= " + typeOfMilitaryPlane +
                '}';
    }
}
