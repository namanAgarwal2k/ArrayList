package GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<String>();

public void addGroceryList(String item){

    groceryList.add(item.toLowerCase());
}
public void removeItemFromList(String item){
    groceryList.remove(item.toLowerCase());
}
public void printGroceryList(){
groceryList.forEach(System.out::println );  //isma number kase add kara list ma.
//  groceryList.forEach((item)-> System.out.println(item));

}

    public void searchItemInList(String searchItem) {
    int position = findGroceryItem(searchItem);
        if(position >=0){
            String item = groceryList.get(position);
            System.out.println("found"+item+"in our grocery list");
        }else {
            System.out.println("Item"+searchItem+"is not in our grocery list");
        }

    }


    private int findGroceryItem(String searchItem) {
    return groceryList.indexOf(searchItem.toLowerCase());
    }

    public void modifyItem(String oldItem, String newItem) {
       groceryList.stream().filter(item -> item.equals(oldItem)).forEach( e ->
                     groceryList.set(groceryList.indexOf(e), newItem));
                     
 }

    private void modifyGroceryItem(int position, String newItem) {
    groceryList.set(position,newItem);
    }
}


