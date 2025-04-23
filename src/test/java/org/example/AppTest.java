package org.example;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


            @Test
            public void testAddition() {
            int sum = 2 + 3;
            assertEquals(5, sum);
        }
}
