/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class CalculadoraTest {
    
    @Test
    public void testCalculate() {
        //System.out.println("calculate");
        int num1 = 2;
        int num2 = 3;
        String op = "*";
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.calculate(num1, num2, op);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
