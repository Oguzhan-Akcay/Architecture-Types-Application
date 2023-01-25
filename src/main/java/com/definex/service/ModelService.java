package com.definex.service;
import com.definex.model.Architecture;
import com.definex.model.House;
import com.definex.model.Summerhouse;
import com.definex.model.Villa;
import java.util.ArrayList;
import java.util.List;

public class ModelService {

    //Method to calculate Total Price
    public static double totalPrice(List<?> totals){
        double totalValue=0;
        for (Object object:totals){
            totalValue += ((Architecture)object).getPrice();
        }
        return totalValue;
    }

    //Method to Calculate Total Architecture Price
    public static void totalHomePrice(){
        double summerHousePriceSum = ModelService.totalPrice(ArchitectureService.getSummerhousesList());
        double villaPriceSum = ModelService.totalPrice(ArchitectureService.getVillasList());
        double housePriceSum = ModelService.totalPrice(ArchitectureService.getHousesList());
        double totalPriceSum = summerHousePriceSum+villaPriceSum+housePriceSum;
        System.out.println("Total Price of All Architectures: " + totalPriceSum+ "$" + "\n");
    }

    //Method to Calculate Average Area
    public static double averageArea(List<?> area){
        int numberHome = 0;
        double totalValue=0;
        for (Object object:area){
            numberHome += 1;
            totalValue += ((Architecture)object).getArea();
        }
        return totalValue/numberHome;
    }

    //Method to Calculate Total Area
    public static double totalArea(List<?> totals){
        double totalValue=0;
        for (Object object:totals){
            totalValue += ((Architecture)object).getArea();
        }
        return totalValue;
    }

    //Method to Calculate Total Average Area
    public static void totalAreaAverage(){
        double totalSummerHousesArea = ModelService.totalArea(ArchitectureService.getSummerhousesList()) ;
        double totalVillasArea = ModelService.totalArea(ArchitectureService.getVillasList());
        double totalHousesArea = ModelService.totalArea(ArchitectureService.getHousesList());
        double totalAllArea = (totalSummerHousesArea+totalVillasArea+totalHousesArea) /
                ((ArchitectureService.getHousesList().size())+ (ArchitectureService.getVillasList().size()) + (ArchitectureService.getSummerhousesList().size()));
        System.out.println("Total Average of All Architectures: " + totalAllArea+ "m²");
    }

    //Method to Filter Room
    public static List<Architecture> filterRoom(String roomCount){
        List<Architecture> architectureList = new ArrayList<>();
        for (House house : ArchitectureService.getHousesList()){
            if (house.getRoom().equals(roomCount)){
                architectureList.add(house);
            }
        }
        for (Villa villa : ArchitectureService.getVillasList()){
            if (villa.getRoom().equals(roomCount)){
                architectureList.add(villa);
            }
        }
        for (Summerhouse summerhouse : ArchitectureService.getSummerhousesList()){
            if (summerhouse.getRoom().equals(roomCount)){
                architectureList.add(summerhouse);
            }
        }
        return architectureList;
    }
}