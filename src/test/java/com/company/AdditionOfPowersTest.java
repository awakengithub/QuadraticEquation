package com.company;

import org.junit.Assert;
import org.junit.Test;

public class AdditionOfPowersTest {

    @Test
    public void testStandard() {
        AdditionOfPowers anotherTesting = new AdditionOfPowers();
        Assert.assertEquals(5, anotherTesting.calculate(2));
    }

    @Test
    public void testZero() {
        AdditionOfPowers anotherTesting = new AdditionOfPowers();
        Assert.assertEquals(0, anotherTesting.calculate(0));
    }
}
