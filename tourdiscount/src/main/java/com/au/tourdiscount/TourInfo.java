package com.au.tourdiscount;

public class TourInfo {
   private Tour tour;
   private int quantity;
   
   public TourInfo(Tour tour)
   {
	   this.setTour(tour);
   }
public Tour getTour() {
	return tour;
}
private void setTour(Tour tour) {
	this.tour = tour;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
   
}
