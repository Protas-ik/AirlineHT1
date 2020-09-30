package domain.plane;

public abstract class Plane {

    private double weight = 0;
    // дальность полета
    private double rangeOfFlight = 0;
    // грузоподъемность
    private double carryingCapacity = 0;
    // вместимость(людей)
    private int capacity = 0;
    // рассход топлива
    private double fuelConsumption = 0;
    private String model="";

    public Plane(){
    }

    public Plane(double weight,double rangeOfFlight, double carryingCapacity, int capacity,
                 double fuelConsumption, String model){
        this.weight = weight;
        this.rangeOfFlight = rangeOfFlight;
        this.carryingCapacity = carryingCapacity;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (Double.compare(weight, 0d) == -1) {
            throw new IllegalArgumentException("Weight is not valid");
        }
        this.weight = weight;
    }

    public double getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(double rangeOfFlight) {
        if (Double.compare(rangeOfFlight, 0d) == -1) {
            throw new IllegalArgumentException("range Of Flight is not valid");
        }
        this.rangeOfFlight = rangeOfFlight;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        if (Double.compare(carryingCapacity, 0d) == -1) {
            throw new IllegalArgumentException("carryingCapacity is not valid");
        }
        this.carryingCapacity = carryingCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity less or equal to 0 ");
        }
        this.capacity = capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (Double.compare(fuelConsumption, 0d) == -1) {
            throw new IllegalArgumentException("fuelConsumption is not valid");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new NullPointerException("model is null");
        }
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "weight=" + weight +
                ", rangeOfFlight=" + rangeOfFlight +
                ", carryingCapacity=" + carryingCapacity +
                ", capacity=" + capacity +
                ", fuelConsumption=" + fuelConsumption +
                ", model='" + model + '\'' +
                '}';
    }

}
