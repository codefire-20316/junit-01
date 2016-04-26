/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.codefire.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author human
 */
public class ParkingTest {

    private Parking parking;

    @Before
    public void setUpClass() {
        parking = new Parking();
    }

    @After
    public void tearDownClass() {
        parking = null;
    }

    @Test
    public void testRemove() {
        String number = "AA 0000 BB";
        parking.add(new Car(number));
        
        Car remove = parking.remove(number);
        
        assertNotNull("Object is null!", remove);
        assertEquals(number, remove.getNumber(), "Number not equal!");
    }

}
