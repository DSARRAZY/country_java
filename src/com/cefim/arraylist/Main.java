package com.cefim.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static Object Country;

    public static void main(String[] args) {

        Country c1 = new Country("FRANCE");
        Country c2 = new Country("USA");
        Country c3 = new Country("CHINE");
        Country c4 = new Country("AUSTRALIE");

        List<Country> countryList = new ArrayList<>();
        countryList.add(c1);
        countryList.add(c2);
        countryList.add(c3);
        countryList.add(c4);

        System.out.println("******************");

        // LISTE DES PAYS
        for (Country country : countryList) {
            System.out.println(country.getName());
        }

        System.out.println("******************");

        // NOMBRE DE PAYS
        System.out.println("NB de pays : " + countryList.size());

        System.out.println("******************");

        boolean ans = countryList.isEmpty();
        if (ans == true)
            System.out.println("The List is empty");
        else
            System.out.println("The List is not empty");

        for (Country country : countryList) {
            System.out.println(country.getName());
        }

        System.out.println("******************");

        // Vider le ArrayList
        //countryList.clear();
        System.out.println("NB de pays : " + countryList.size());

        ans = countryList.isEmpty();
        if (ans == true)
            System.out.println("The List is empty");
        else
            System.out.println("The List is not empty");

        System.out.println("******************");

        List<String> countryList2 = new ArrayList<>();
        countryList2.add("FRANCE");
        countryList2.add("USA");
        countryList2.add("MALI");
        countryList2.add("TURQUIE");

        countryList2.set(1, "OZ");
        for (int index = 0; index < countryList2.size(); index++) {
            String elm = countryList2.get(index);
            System.out.println(elm);
        }
        ;

        System.out.println("******************");

        Collections.sort(countryList2);
        for (int index = 0; index < countryList2.size(); index++) {
            String elm = countryList2.get(index);
            System.out.println(elm);
        }

        System.out.println("******************");

        Collections.sort(countryList2, Collections.reverseOrder());
        for (int index = 0; index < countryList2.size(); index++) {
            String elm = countryList2.get(index);
            System.out.println(elm);
        }

        System.out.println("******************");

        Collections.sort(countryList, new CountryComparator());
        for (Country country : countryList) {
            System.out.println(country.getName());
        }
        new CountryComparator().compare(c3,c4);



    }

}


