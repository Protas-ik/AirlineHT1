package domain.plane.firefighters;

import domain.plane.freight.Freight;
import domain.plane.freight.TypeOfCargo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFirefighters {

    private static Firefighters firefighters;

    @Before
    public void setUp(){
        firefighters = new Firefighters(2000.5,400,10,600,
                100,"PROTASIK", TypeOfExtinguishingAgents.FOAM);
    }

    @Test
    public void getTypeOfExtinguishingAgents() {
        Assert.assertEquals(TypeOfExtinguishingAgents.FOAM,firefighters.getTypeOfExtinguishingAgents());
    }

    @Test
    public void setTypeOfExtinguishingAgents() {
        Assert.assertNotNull(firefighters);
        firefighters.setTypeOfExtinguishingAgents(TypeOfExtinguishingAgents.WATER);
        Assert.assertEquals(firefighters.getTypeOfExtinguishingAgents(), TypeOfExtinguishingAgents.WATER);
    }
}