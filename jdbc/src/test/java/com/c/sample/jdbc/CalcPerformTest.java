package com.c.sample.jdbc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class CalcPerformTest {
	
    @Before
    public void setUp() {
        CalcPerform calculator = new CalcPerform();
    }
    
	@Test
	public void calcPtest() {
		Calculator mockedCal = mock(Calculator.class);
		when(mockedCal.add(10, 20)).thenReturn(30);
		int sum = mockedCal.add(10, 20);
		assertEquals(30, sum);
		CalcPerform calculator = new CalcPerform();
		calculator.setCal(mockedCal);
		assertEquals(30, calculator.calResult(1, 10, 20));
	}
	
    @Test
    public void testSub() {
		Calculator mockedCal = mock(Calculator.class);
		when(mockedCal.sub(10, 5)).thenReturn(5);
        int sub = mockedCal.sub(10, 5);
        assertEquals(5, sub);
    }
 
    @Test
    public void testMultiply() {
		Calculator mockedCal = mock(Calculator.class);
		when(mockedCal.mul(2, 5)).thenReturn(10);
        int result = mockedCal.mul(2, 5);
        assertEquals(10, result);
    }
}
