package domain.plane.postage;

import domain.plane.passanger.Passenger;
import domain.plane.passanger.TypeOfPassengerPlane;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPostage {

    private static Postage postage;

    @Before
    public void setUp(){
        postage = new Postage(2000.5,400,10,600,
                100,"PROTASIK",TypeOfMail.LETTER);
    }

    @Test
    public void testgetTypeOfMail() {
        Assert.assertEquals(TypeOfMail.LETTER,postage.getTypeOfMail());
    }

    @Test
    public void testsetTypeOfMail() {
        Assert.assertNotNull(postage);
        postage.setTypeOfMail(TypeOfMail.PARSEL);
        Assert.assertEquals(postage.getTypeOfMail(), TypeOfMail.PARSEL);
    }
}