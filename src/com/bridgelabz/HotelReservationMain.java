package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationMain {
	public static void main(String[] args) {
        System.out.println("----------Welcome to the Hotel reservation System program---------");
        List<Hotel> hotelDataList = new ArrayList<>();
        Hotel hotel1 = new Hotel("LakeWood",110,90,80,80);
        Hotel hotel2 = new Hotel("Bridgewood",160,110,60,50);
        Hotel hotel3 = new Hotel("Ridgewood",220, 100,150, 40);
        hotelDataList.add(hotel1);
        hotelDataList.add(hotel2);
        hotelDataList.add(hotel3);
        System.out.println(hotelDataList);

    }

}
