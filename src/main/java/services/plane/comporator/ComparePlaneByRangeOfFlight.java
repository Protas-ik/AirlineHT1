package services.plane.comporator;

import domain.plane.Plane;

import java.util.Comparator;

public class ComparePlaneByRangeOfFlight implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        return Double.compare(o1.getRangeOfFlight(), o2.getRangeOfFlight());
    }
}
