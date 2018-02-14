/*
 * {Westfield State University}:Program Design 2
 * Zachary Hadjah
 * 
 */
package findclosestelement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zach
 */
public class FindClosestElementTest {
    
    public FindClosestElementTest() {
    }

    /**
     * Test of findClosestNum method, of class FindClosestElement.
     */
    @Test
    public void testFindClosestNum() {
        System.out.println("findClosestNum");
        int userNum = -15;
        int expResult = -14;
        int result = FindClosestElement.findClosestNum(userNum);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
