/* 
 * Copyright (C) 2018 Karol
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package evilcorpcalc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karol
 */

public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @Test
    public void testAddition() {
        System.out.println("addition 20+5");
        int first = 20;
        int second = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.addition(first, second);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddition2() {
        System.out.println("addition 30 + 2");
        int first = 30;
        int second = 2;
        Calculator instance = new Calculator();
        int expResult = 32;
        int result = instance.addition(first, second);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubstraction() {
        System.out.println("substraction 20-5");
        int first = 20;
        int second = 5;
        Calculator instance = new Calculator();
        int expResult = 15;
        int result = instance.substraction(first, second);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testSubstraction2() {
        System.out.println("substraction 30-2");
        int first = 30;
        int second = 2;
        Calculator instance = new Calculator();
        int expResult = 28;
        int result = instance.substraction(first, second);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMultiplication() {
        System.out.println("multiplication 20*5");
        int first = 20;
        int second = 5;
        Calculator instance = new Calculator();
        int expResult = 100;
        int result = instance.multiplication(first, second);
        assertEquals(expResult, result);  
    }

    @Test
    public void testMultiplication2() {
        System.out.println("multiplication 30*2");
        int first = 30;
        int second = 2;
        Calculator instance = new Calculator();
        int expResult = 60;
        int result = instance.multiplication(first, second);
        assertEquals(expResult, result);  
    }
    
    @Test
    public void testDivision() {
        System.out.println("division 20/5");
        int first = 20;
        int second = 5;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.division(first, second);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testDivision2() {
        System.out.println("division 30/2");
        int first = 30;
        int second = 2;
        Calculator instance = new Calculator();
        int expResult = 15;
        int result = instance.division(first, second);
        assertEquals(expResult, result);
    }
    
}
