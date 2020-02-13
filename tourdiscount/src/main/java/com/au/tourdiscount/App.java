package com.au.tourdiscount;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	//all the test cases in the PDF are in test class
    public static void main( String[] args )
    {
        List <TourInfo> tourInfoList=new ArrayList<TourInfo>();
        TourInfo operaHouseTour=new TourInfo(new Tour("OH"));
        operaHouseTour.setQuantity(3);
        tourInfoList.add(operaHouseTour);
        
        TourInfo BridgeClimbTour=new TourInfo(new Tour("BC"));
        BridgeClimbTour.setQuantity(1);
        tourInfoList.add(BridgeClimbTour);
        
       /* TourInfo SydneySkyTowerTour=new TourInfo(new Tour("SK"));
        SydneySkyTowerTour.setQuantity(1);
        tourInfoList.add(SydneySkyTowerTour);*/
        
        PromotionalRules rules=new PromotionalRules();
        rules.setTour(tourInfoList);
        ShoppingCart cart= new ShoppingCart(rules);
        cart.setTourList(tourInfoList);
        System.out.println("totalprice :"+cart.totalPrice());
        
    }
}
