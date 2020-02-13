package com.au.tourdiscount;

import java.util.List;

public class PromotionalRules {
    private List <TourInfo> tour;

	public PromotionalRules() {
		
	}
	 
     public double addPromotion()
    {
    	double pramotionalPrice=0;
    	int OHcnt=0;
    	int BCcnt=0;
    	int SKcnt=0;
    	for(TourInfo tour:this.getTour()) {
    		
    	if(tour.getTour().getTourName().equalsIgnoreCase("OH"))
    	{
    		OHcnt=tour.getQuantity();
    		pramotionalPrice+=(tour.getQuantity()/3) * tour.getTour().getTourPrice();
    	}
    	if(tour.getTour().getTourName().equalsIgnoreCase("SK")) {
    		SKcnt=tour.getQuantity();
    		if(OHcnt >0 && OHcnt>=SKcnt)
    			pramotionalPrice+=tour.getTour().getTourPrice()*SKcnt;
    		if(OHcnt >0 && OHcnt<SKcnt)
    			pramotionalPrice+=tour.getTour().getTourPrice()*(SKcnt-OHcnt);
    	}
    	if(tour.getTour().getTourName().equalsIgnoreCase("BC")) {
    		BCcnt=tour.getQuantity();
    		if(BCcnt>4)
    		{
    			pramotionalPrice+=(tour.getTour().getTourPrice()-20)*(BCcnt-4);
    		}
    	}
    	}
    	return pramotionalPrice;
    }

	public List<TourInfo> getTour() {
		return tour;
	}

	public void setTour(List<TourInfo> tour) {
		this.tour = tour;
	}
    
    
}
