package com.mycompany.app;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	public void testFound(){
		ArrayList<String> array = new ArrayList<>(Arrays.asList("aliayse","ayse","merve","gokhan"));
		assertTrue(new App().method(array,"ali","ayse"));
	}
	public void testNotFound(){
		ArrayList<String> array = new ArrayList<>(Arrays.asList("ali","ayse","merve","gokhan"));
		assertFalse(new App().method(array,"ali","burak"));

	}
	public void testEmptyArray(){
		ArrayList<String> array = new ArrayList<>();
		assertFalse(new App().method(array,"cemre","sevval"));
	}
	public void testNull(){
		assertFalse(new App().method(null,"ali","veli"));
	}
	public void emptyStrings(){
		ArrayList<String> array = new ArrayList<>(Arrays.asList("aliayse","ayse","merve","gokhan"));
		assertFalse(new App().method(array,"",""));
	}
}
