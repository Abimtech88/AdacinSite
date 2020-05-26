package com.step;

import com.resources.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	
	public void before() {
    System.out.println("Hooks started");		

	}
	
	@After
	
	public void after() {

    System.out.println("Hooks Completed"); 
	}
}
