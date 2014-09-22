

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (zmswartz) 
 * @version (9/18/14)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testFillUp()
    {
        VendingMachine vm1 = new VendingMachine(10,0);
        vm1.fillUp(7);
        int cans = vm1.getCans();
        assertEquals(17,cans);
        
    }
    @Test
    public void testGetCans()
    {
        VendingMachine vm1 = new VendingMachine(6,3);
        int cans = vm1.getCans();
        assertEquals(6, cans);
        vm1.fillUp(12);
        cans = vm1.getCans();
        assertEquals(18, cans);
    }
    
    @Test
    public void testGetTokens()
    {
        VendingMachine vm1 = new VendingMachine(6,3);
        int coins = vm1.getTokens();
        assertEquals(3,coins);
        vm1.dispense(2);
        coins = vm1.getTokens();
        assertEquals(5,coins);
    }
    
    @Test
    public void testDispense()
    {
        VendingMachine vm1 = new VendingMachine(11,5);
        int coins = vm1.getTokens();
        assertEquals(5,coins);
        int cans = vm1.getCans();
        assertEquals(11, cans);
        vm1.dispense(3);
        coins = vm1.getTokens();
        assertEquals(8,coins);
        cans = vm1.getCans();
        assertEquals(8, cans);
    }

}
