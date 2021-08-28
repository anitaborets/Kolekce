package com.engeto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// list
        ArrayList<String> list = new ArrayList<>();
        list.add("Vit");
        list.add("Jana");
        list.add("Karel");
        list.add("Edita");
        list.add("Jana");

        for (String item : list) {
            System.out.println(item);
        }

        int itemsCount = list.size();
        System.out.println(itemsCount);

        System.out.println(list.get(2));

        list.remove(1);

        if (list.contains("Ivan"))
                System.out.println("Ivan je v zozname");
        else
            System.out.println("Ivan nie je v zozname");

        if(list.contains("Vit"))
                System.out.println("Vit je v zozname");
        else
            System.out.println("Vit nie je v zozname");

        itemsCount = list.size();
        System.out.println(itemsCount);
        System.out.println(list.get(2));

        System.out.println("******************************");

        //HashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Vit");
        hashMap.put(2, "Jana");
        hashMap.put(3, "Karel");
        hashMap.put(4, "Klara");
        hashMap.put(5, "Jana");
        hashMap.put(1989, "Vaclav");
        hashMap.put(2, "Ivan");

        for (Map.Entry entry: hashMap.entrySet()) {

            System.out.println(entry);
        }
        System.out.println("Celkom " + hashMap.size());
        System.out.println("hodnota s klíčem 4 " + hashMap.get(4));
        hashMap.remove(2);
        System.out.println("hodnota s klíčem 4 " + hashMap.get(4));
        hashMap.remove("Karel");
        //•	Vypiš, zda mapa obsahuje hodnotu s klíčem 3 a s klíčem 5.
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsKey(5));
        //Vypiš, zda mapa obsahuje hodnotu "Ivan" či "Václav".
        System.out.println(hashMap.containsValue("Ivan"));
        System.out.println(hashMap.containsValue("Vaclav"));
        for (Map.Entry entry: hashMap.entrySet()) {

            System.out.println(entry);
        }
        System.out.println("******************************");

        //Set
        HashSet<String>set = new HashSet<String>();
        set.add("Vit");
        set.add("Jana");
        set.add("Karel");
        set.add("Klara");
        set.add("Jana");

        for(String name : set){

            System.out.println(name);
        }
        //Vypište počet prvků v množině
        System.out.println("Celkom " + set.size());
        System.out.println(set.contains("Jana"));
        set.remove("Jana");
        System.out.println(set.contains("Jana"));
        System.out.println("Celkom " + set.size());
        System.out.println("******************************");

//svatky

        HashMap<MonthDay, String> event = new HashMap<MonthDay, String>();
   
        event.put(MonthDay.of(01,01), "Nový rok");
        event.put(MonthDay.of(02,01), "Tatiana");
        event.put(MonthDay.of(02,02), "Erika a Erik");
        event.put(MonthDay.of(03,03), "Bohumil a Bohumila");
        event.put(MonthDay.of(04,01), "Hugo");

        System.out.println("dnes ma svatek " + event.getOrDefault(MonthDay.now(), "Svátek není zadaný"));
        MonthDay date1 = MonthDay.of(04,01);
        System.out.println(date1 + " ma svatek " + event.get(date1));


    }


}
