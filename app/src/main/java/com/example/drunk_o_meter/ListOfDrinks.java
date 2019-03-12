package com.example.drunk_o_meter;

import java.util.ArrayList;

class ListOfDrinks {
    // standard singleton set-up
    private ArrayList<Drink> listOfDrinks;

    private static final ListOfDrinks ourInstance = new ListOfDrinks();


    public static ListOfDrinks getInstance() {
        return ourInstance;
    }

    /**
     * types of drinks that can be added
     */
    private ListOfDrinks() {
        listOfDrinks = new ArrayList<Drink>();
        listOfDrinks.add(new Drink("Beer"));
        listOfDrinks.add(new Drink("Wine"));
        listOfDrinks.add(new Drink("Cider"));
        listOfDrinks.add(new Drink("Liquor"));
        listOfDrinks.add(new Drink("Whisky"));
        listOfDrinks.add(new Drink("Tequila"));
        listOfDrinks.add(new Drink("Brandy"));
        listOfDrinks.add(new Drink("Rum"));
        listOfDrinks.add(new Drink("Gin"));


    }

    /**
     * return the list of drinks
     * @return list of drinks
     */
    public ArrayList<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    /**
     * get the drink at position i
     * @param i
     * @return drink at position i
     */
    public Drink getDrinks(int i) {
        return listOfDrinks.get(i);
    }

}
