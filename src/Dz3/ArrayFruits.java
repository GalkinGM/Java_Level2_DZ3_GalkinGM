package Dz3;

import java.util.*;

public class ArrayFruits {

    public void arrayFruits (){

    String [] arrayFruits = new String[] {

            "яблоки", "хурма", "авокадо", "банан",
            "черника", "грейпфрут", "инжир",
            "киви", "ананас", "лимон", "хурма", "грейпфрут"
    };

    List<String> listFruits =new ArrayList<>();
        listFruits.add( "киви" );
        listFruits.addAll(Arrays.asList(arrayFruits));


    Set<String> setFruits = new HashSet<>();
        setFruits.addAll(listFruits);


    Map<String,Integer > mapFruits = new TreeMap<>();
        for (String w : listFruits) {
        int val = mapFruits.getOrDefault(w, 0);
        mapFruits.put((w), val + 1);
    }


        System.out.println(listFruits);
        System.out.println(setFruits);
        System.out.println(mapFruits);

        System.out.println(String.format( "В массиве слов: %s , в списке слов: %s уникальных значений: %s",
                arrayFruits.length, listFruits.size(),setFruits.size()));


}


}
