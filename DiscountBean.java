package com.niit.bean;

public class DiscountBean {
  private double totalamt=0;

public DiscountBean() {
	super();
}

public double getTotalamt() {
	return (totalamt*0.02);
}

public void setTotalamt(double totalamt) {
	this.totalamt = totalamt;
}
  
}
