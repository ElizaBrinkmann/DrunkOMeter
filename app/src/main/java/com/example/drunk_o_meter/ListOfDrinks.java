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
        listOfDrinks.add(new Drink("Wine", 1));
        listOfDrinks.add(new Drink("Cider", 1));
        listOfDrinks.add(new Drink("Liquor", 1));
        listOfDrinks.add(new Drink("Whisky", 1));
        listOfDrinks.add(new Drink("Tequila", 1));
        listOfDrinks.add(new Drink("Brandy", 1));
        listOfDrinks.add(new Drink("Rum", 1));
        listOfDrinks.add(new Drink("Gin", 1));


    }

    public ArrayList<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    public Drink getDrinks(int i) {
        return listOfDrinks.get(i);
    }

}
