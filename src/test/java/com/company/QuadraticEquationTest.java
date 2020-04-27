package com.company;

import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationTest {
    @Test
    public void testRegular() {
        QuadraticEquation testing = new QuadraticEquation();
        ReturningNumber expected = new ReturningNumber(-0.25, -1.0);
        Assert.assertEquals(expected, testing.counting(4, 5, 1));
    }

    @Test
    public void testNoRoots() {
        QuadraticEquation testing = new QuadraticEquation();
        ReturningNumber expected = new ReturningNumber(null,null);
        Assert.assertEquals(expected, testing.counting(2,2,1));
    }

    @Test
    public void testOneRoot() {
        QuadraticEquation testing = new QuadraticEquation();
        ReturningNumber expected = new ReturningNumber(-1.0,null);
        Assert.assertEquals(expected, testing.counting(1,2,1));
    }

    @Test
    public void testZeroes() {
        QuadraticEquation testing = new QuadraticEquation();
        ReturningNumber expected = new ReturningNumber(null,null);
        Assert.assertEquals(expected, testing.counting(0,8,9));
    }
    @Test
    public void testFail() {
        QuadraticEquation testing = new QuadraticEquation();
        ReturningNumber expected = new ReturningNumber(5.0,5.0);
        Assert.assertEquals(expected, testing.counting(0,8,9));
    }
}
