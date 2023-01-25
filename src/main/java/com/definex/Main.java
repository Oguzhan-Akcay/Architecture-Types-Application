package com.definex;
import com.definex.model.Architecture;
import com.definex.service.ArchitectureService;
import com.definex.service.ModelService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArchitectureService.addArchitecture();

        //Methods to printing Architecture list
        System.out.println("********** List of All Architectures **********");
        ArchitectureService.printList(ArchitectureService.getHousesList());
        ArchitectureService.printList(ArchitectureService.getVillasList());
        ArchitectureService.printList(ArchitectureService.getSummerhousesList());

        System.out.println("********** Total Price List of All Architecture Types **********");
        //Methods to printing Architecture price list
        System.out.println("Total Price of All Houses : " + ModelService.totalPrice(ArchitectureService.getHousesList()) + "$");
        System.out.println("Total Price of All Villas: " + ModelService.totalPrice(ArchitectureService.getVillasList()) + "$");
        System.out.println("Total Price of All SummerHouses: " + ModelService.totalPrice(ArchitectureService.getSummerhousesList()) + "$");
        ModelService.totalHomePrice();

        System.out.println("********** Average Area List of All Architecture Types **********");
        System.out.println("Average Area of All Houses: " + ModelService.averageArea(ArchitectureService.getHousesList()));
        System.out.println("Average Area of All Villas: " +ModelService.averageArea(ArchitectureService.getVillasList()));
        System.out.println("Average Area of All Summerhouses: " +ModelService.averageArea(ArchitectureService.getSummerhousesList()));
        ModelService.totalAreaAverage();

        System.out.println("\n"+"********** List Filtered by Number of Rooms and Halls **********");
        List<Architecture> threeRoomList = ModelService.filterRoom("3+1");
        List<Architecture> fourRoomList = ModelService.filterRoom("4+1");
        List<Architecture> fiveRoomList = ModelService.filterRoom("5+1");
        System.out.println( threeRoomList + "\n" + fourRoomList + "\n" + fiveRoomList);
    }
}