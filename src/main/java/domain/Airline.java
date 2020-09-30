package domain;

import domain.plane.Plane;
import java.util.ArrayList;
import java.util.List;

public class Airline {

    private String name = "";
    public List<Plane> planes = new ArrayList<Plane>();

    public Airline(){
    }

    public Airline(String name,List<Plane> planes){
        this.name = name;
        this.planes = planes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name is null");
        }
        this.name = name;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        if (planes == null) {
            throw new NullPointerException("Planes is null");
        }
        this.planes = planes;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", planes=" + planes +
                '}';
    }
}
