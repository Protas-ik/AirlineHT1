package domain.plane.military;

import domain.plane.firefighters.Firefighters;
import domain.plane.firefighters.TypeOfExtinguishingAgents;
import domain.plane.freight.TypeOfCargo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMilitary {

    private static Military military;

    @Before
    public void setUp() {
        military = new Military(2000.5, 400, 10, 600,
                100, "PROTASIK",9.2,TypeOfMilitaryPlane.FIGHTER);
    }

    @Test
    public void getWeaponCaliber() {
        Assert.assertEquals(9.2,military.getWeaponCaliber(),0);
    }

    @Test
    public void setWeaponCaliber() {
        military.setWeaponCaliber(10.2);
        Assert.assertEquals(10.2,military.getWeaponCaliber(),0);
    }

    @Test
    public void getTypeOfMilitaryPlane() {
        Assert.assertEquals(TypeOfMilitaryPlane.FIGHTER,military.getTypeOfMilitaryPlane());
    }

    @Test
    public void setTypeOfMilitaryPlane() {
        Assert.assertNotNull(military);
        military.setTypeOfMilitaryPlane(TypeOfMilitaryPlane.BOMBER);
        Assert.assertEquals(military.getTypeOfMilitaryPlane(),TypeOfMilitaryPlane.BOMBER);
    }
}