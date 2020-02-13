package com.au.tourdiscount;

import java.util.List;

public class ShoppingCart {
	
	private PromotionalRules rules;
	private List <TourInfo>tourList;
	public List<TourInfo> getTourList() {
		return tourList;
	}

	public void setTourList(List<TourInfo> tourList) {
		this.tourList = tourList;
	}

	private double totalPrice;
	

	private double getTotalPrice() {
		return totalPrice;
	}

	private void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public PromotionalRules getRules() {
		return rules;
	}

	public void setRules(PromotionalRules rules) {
		this.rules = rules;
	}
	
	
	public ShoppingCart(PromotionalRules rules) {
		super();
		this.rules = rules;
	}
	

     public void  addTour(TourInfo tourInfo)
     {
    	 this.tourList.add(tourInfo);
     }
     
     public double totalPrice()
     {
    	 double totalPrice=0;
    	 for(TourInfo tour:this.tourList)
    	 {
    		 totalPrice+=tour.getQuantity()*tour.getTour().getTourPrice();
    	 }
    	 totalPrice=totalPrice-rules.addPromotion();
    	 return totalPrice;
     }
     
}
