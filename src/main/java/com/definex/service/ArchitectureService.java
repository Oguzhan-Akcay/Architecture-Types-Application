package com.definex.service;
import com.definex.model.Architecture;
import com.definex.model.House;
import com.definex.model.Summerhouse;
import com.definex.model.Villa;
import java.util.ArrayList;
import java.util.List;
public class ArchitectureService {

    static List<House> houseList = new ArrayList<>();
    static List<Villa> villaList = new ArrayList<>();
    static List<Summerhouse> summerhouseList = new ArrayList<>();

    //Adding a build and information using the Builder
    public static void addArchitecture(){

        House house1 = House.builder().price(2500.0).room("3+1").area(150).name("Akcay Apartment").build();
        House house2 = House.builder().price(3500.0).room("4+1").area(250).name("Yilmaz Apartment").build();
        House house3 = House.builder().price(4500.0).room("5+1").area(350).name("Oz Apartment").build();

        Villa villa1 = Villa.builder().price(5500.0).room("3+1").area(450).name("Palm City Villas").build();
        Villa villa2 = Villa.builder().price(6500.0).room("4+1").area(550).name("Lara City Villas").build();
        Villa villa3 = Villa.builder().price(7500.0).room("5+1").area(650).name("Konyaalti City Villas").build();

        Summerhouse summerhouse1 = Summerhouse.builder().price(10000.0).room("4+1").area(300).name("Akyazi SummerHouses").build();
        Summerhouse summerhouse2 = Summerhouse.builder().price(20000.0).room("5+1").area(250).name("Beldibi SummerHouses").build();
        Summerhouse summerhouse3 = Summerhouse.builder().price(50000.0).room("6+1").area(550).name("Datca SummerHouses").build();

        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        summerhouseList.add(summerhouse1);
        summerhouseList.add(summerhouse2);
        summerhouseList.add(summerhouse3);
    }

    //Method to print Villas, Summerhouses and Houses lists
    public static void printList(List<?> list){
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0;i<list.size();i++){
            Architecture architecture = (Architecture ) list.get(i);
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(architecture.toString());
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    //Getter Methods
    public static List<House> getHousesList(){
        return houseList;
    }

    public static List<Villa> getVillasList(){
        return villaList;
    }

    public static List<Summerhouse> getSummerhousesList(){
        return summerhouseList;
    }
}