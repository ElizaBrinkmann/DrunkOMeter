package com.example.drunk_o_meter;

import java.util.ArrayList;

class ListOfDrinks {
    private ArrayList<Drink> listOfDrinks;
    private static final ListOfDrinks ourInstance = new ListOfDrinks();


    public static ListOfDrinks getInstance() {
        return ourInstance;
    }

    private ListOfDrinks() {
        listOfDrinks = new ArrayList<Drink>();
        listOfDrinks.add(new Drink("Beer", 1));
        listOfDrinks.add(new Drink("Wine", 2));
        listOfDrinks.add(new Drink("Cider", 1));
        listOfDrinks.add(new Drink("Liquor", 3));
        listOfDrinks.add(new Drink("Whisky", 3));
        listOfDrinks.add(new Drink("Tequila", 3));
        listOfDrinks.add(new Drink("Brandy", 3));
        listOfDrinks.add(new Drink("Rum", 3));
        listOfDrinks.add(new Drink("Gin", 3));


    }

    public ArrayList<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    public Drink getDrinks(int i) {
        return listOfDrinks.get(i);
    }
}
