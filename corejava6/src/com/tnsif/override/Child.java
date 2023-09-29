package com.tnsif.override;

public class Child extends Parent {
	private void m2()
	{
		System.out.println("From child m1()");
	}
    public void m2()
    {
    	System.out.println("From child m2()");
    }
}
