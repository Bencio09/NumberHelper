/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberhelper;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author loreb
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @org.junit.Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = null;
        boolean expResult = true;
        boolean result = new NumberHelper(2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @org.junit.Test
    public void testIsEven1() {
        System.out.println("isEven");
        NumberHelper instance = null;
        boolean expResult = false;
        boolean result = new NumberHelper(3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = null;
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.Test
    public void testSum() {
        System.out.println("sum");
        int n = 0;
        NumberHelper instance = null;
        int expResult = 0;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = null;
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @org.junit.Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = null;
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
