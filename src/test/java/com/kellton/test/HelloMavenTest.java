package com.kellton.test;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	
	 @Override
	    protected String getConfigFile() {
	        return "mulemavenizedproject.xml";
	    }

	 
	@Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
	
	   
   /* @Test
    public void retrieveFlightsFlightsMaven() throws Exception {
        runFlowAndExpect("retrieveFlights", "Hello Sadik");
    }*/
    
   /* @Test
    public void logFlightsMaven() throws Exception {
        runFlowAndExpect("logFlights", "Hello Sadik");
    }*/
    
   
}
