package com.aws.wwps.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MessageProcessorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MessageProcessorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MessageProcessorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	assertEquals("stuff2", MessageProcessor.someCall());
    }

}
