package com.au.tourdiscount;

public class Tour {
      private String tourName;
      private int tourPrice;
      
    public Tour(String tourName)
    {
    	this.setTourName(tourName);
    }
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public int getTourPrice() {
		if(tourName.equalsIgnoreCase("OH"))
		this.tourPrice=300;
		else
		if(tourName.equalsIgnoreCase("BC"))
		this.tourPrice=110;
		else if(tourName.equalsIgnoreCase("SK"))
		this.tourPrice=30;	
		return tourPrice;
	}
	public void setTourPrice(int tourPrice) {
		this.tourPrice = tourPrice;
	}
     
}
