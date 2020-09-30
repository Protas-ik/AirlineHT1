package domain.plane.freight;

import domain.plane.postage.Postage;
import domain.plane.postage.TypeOfMail;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFreight {

    private static Freight freight;

    @Before
    public void setUp(){
        freight = new Freight(2000.5,400,10,600,
                100,"PROTASIK", TypeOfCargo.CARS);
    }

    @Test
    public void getTypeOfCargo() {
        Assert.assertEquals(TypeOfCargo.CARS,freight.getTypeOfCargo());
    }

    @Test
    public void setTypeOfCargo() {
        Assert.assertNotNull(freight);
        freight.setTypeOfCargo(TypeOfCargo.FOOD);
        Assert.assertEquals(freight.getTypeOfCargo(), TypeOfCargo.FOOD);
    }
}