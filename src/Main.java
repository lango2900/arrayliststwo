import java.util.*;
public class Main {
    public static void main(String[] args) {

//2D ArrayList = a dynamic list of lists | can be changed during runtime

    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> produceList = new ArrayList();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");

    ArrayList<String> drinksList = new ArrayList();
    drinksList.add("soda");
    drinksList.add("water");
    drinksList.add("tea");

// now we can compile these arraylists into a 2d array list

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList);

        System.out.println(groceryList); // will print out multidimensional groceryList array
        System.out.println(groceryList.get(2)); // will print out produce list based on index
        System.out.println(groceryList.get(2).get(0)); // will print out first item from produce array


        System.out.println(bakeryList); // will print out bakeryList array
        System.out.println(bakeryList.get(0)); // will return specific string from array list

    }
}