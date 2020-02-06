package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;



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


	public void testFound() {
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	ArrayList<String> array2 = new ArrayList<>(Arrays.asList("aaaa","bbbb" ,"cccc" ,"dddd" ));
	assertTrue(new App().search(array,array2,4,"dddd"));
	}

	public void testEmptyArray() {
	ArrayList<Integer> array = new ArrayList<>();
	ArrayList<String> array2 = new ArrayList<>(Arrays.asList("aaaa","bbbb" ,"cccc" ,"dddd" ));
	assertFalse(new App().search(array,array2,1,"aaaa"));
	}

	public void testBothNull() {
	assertFalse(new App().search(null,null,1,"aaaa"));
	}

	public void testAllIncluded(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
	ArrayList<String> array2 = new ArrayList<>(Arrays.asList("aaaa","aaaa" ,"aaaa" ,"aaaa" ));
	assertTrue(new App().search(array,array2,1,"aaaa"));
	}	
        
    	public void testOneNull(){
	ArrayList<String> array2 = new ArrayList<>(Arrays.asList("aaaa","aaaa" ,"aaaa" ,"aaaa" ));	
        assertFalse(new App().search(null,array2,1,"aaaa"));
	}


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
}
