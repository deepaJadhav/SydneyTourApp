package com.au.tourdiscount;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShoppingCartTest {
	

@Test
public void testOperaHouseTour3for1() {
    List <TourInfo> tourInfoList=new ArrayList<TourInfo>();

    TourInfo operaHouseTour=new TourInfo(new Tour("OH"));
    operaHouseTour.setQuantity(3);
    tourInfoList.add(operaHouseTour);
    
    TourInfo BridgeClimbTour=new TourInfo(new Tour("BC"));
    BridgeClimbTour.setQuantity(1);
    tourInfoList.add(BridgeClimbTour);
    
    PromotionalRules rules=new PromotionalRules();
    rules.setTour(tourInfoList);
    ShoppingCart cart= new ShoppingCart(rules);
    cart.setTourList(tourInfoList);
    
    assertEquals(710.0, cart.totalPrice(), 0); 
}
 

public void testBuilkDiscountOnBridgeClimbTour() {
    List <TourInfo> tourInfoList=new ArrayList<TourInfo>();

    TourInfo operaHouseTour=new TourInfo(new Tour("OH"));
    operaHouseTour.setQuantity(1);
    tourInfoList.add(operaHouseTour);
    
    TourInfo bridgeClimbTour=new TourInfo(new Tour("BC"));
    bridgeClimbTour.setQuantity(5);
    tourInfoList.add(bridgeClimbTour);
    
    PromotionalRules rules=new PromotionalRules();
    rules.setTour(tourInfoList);
    ShoppingCart cart= new ShoppingCart(rules);
    cart.setTourList(tourInfoList);
    
    assertEquals(760.0, cart.totalPrice(), 0); 
}

 

}