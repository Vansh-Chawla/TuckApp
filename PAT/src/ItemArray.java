
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vansh Chawla
 */
public class ItemArray {

    private Item[] arr = new Item[1000]; // An array of the type Item to store all the items and their details
    private int count = 0; // A counter to keep track of the number of elements in the array

    public ItemArray() throws FileNotFoundException { // A Constructor that reads in the text file with all the data about the items
        int ItemNumb = 0; // An integer to store the item num of the items
        String description = ""; // A string to store the description of the item
        int StockLeft = 0; // An integer to store the number of units left of the item
        double CostPrice = 0; // A double to store the cost price of the object
        double SellingPrice = 0; // a double to store the selling price of the object
        int SoldMonthly = 0; // an integer to store the number of units sold monthly
        String LastOrder = ""; // a string to store the date of last order of the objecy
        Scanner scFile = new Scanner(new File("Items.txt")); // Creating a scanner object to scan the text file with the details about the object
        while (scFile.hasNext()) { // A while loop till the end of the file 
            String line = scFile.nextLine(); // A variable to break up the file into lines
            Scanner scLine = new Scanner(line).useDelimiter("#"); // A scanner object to store the line, and use the delimeter #
            ItemNumb = scLine.nextInt(); // Extracts the Item number from the text file and stores it
            description = scLine.next(); // Stores the description from the text file
            StockLeft = scLine.nextInt(); // Stores the number of units left from the text file
            CostPrice = scLine.nextDouble(); // Stores the cost price from the text file
            SellingPrice = scLine.nextDouble(); // Stores the selling price from the text file
            SoldMonthly = scLine.nextInt(); // Stores the number of units sold monthly from the text file
            LastOrder = scLine.next(); // Stores the date of last order from the text file
            arr[count] = new Item(ItemNumb, description, StockLeft, CostPrice, SellingPrice, SoldMonthly, LastOrder); // Creates a new object with the details extracted from the text files and adds this object into the array
            count++; // increments the size of count, adding an element to the array
        }

    }

    public int getCount() { // A typed method of the type integer that returns the size of count, the number of elements in the array
        return count;
    }

    public Item SearchItem(int ItemNum) // A typed method of the type Item that searches for the item in the array based on the item number and returns the details of the item found
    {
        Item temp = new Item();  // Creating a temporary variable of the type Item to store the item found
        for (int i = 0; i < count; i++) { // Looping through the array
            if (arr[i].getItemNumber() == (ItemNum)) { // comparing the item number of the item in the arry to the itemnumber required
                temp = arr[i];     // storing the found item into the temporary variable
            }
        }
        return temp; // the details of the item found are returned 
    }

    public boolean SearchItemNumber(int ItemNum) {  // A typed method of the type boolean that checks to see if a specific item exists based on the itemnum
        boolean found = false; // declaring a boolean to store the results of the search
        for (int i = 0; i < count; i++) { // looping throught the array
            if (arr[i].getItemNumber() == ItemNum) { // checking to see if the itemnumber exises
                found = true; // changing the value of found if the item exists to true
            }
        }
        return found; // returning found
    }

    public int ArrayPos(int ItemNum) { // A typed method of the type integer that returns the position of the item in the array
        int pos = 0; // an integer variable to store the position of the item in the array
        for (int i = 0; i < count; i++) { // looping throught the array to find the item
            if (arr[i].getItemNumber() == ItemNum) { // comparing each element's item number to the one parsed in 
                pos = i; // changing the value of position to the element number in the array
            }
        }
        return pos; // returning the position of the item in the array 
    }

    public void InsertItem(String description, int StockLeft, double CostPrice, double SellingPrice, int SoldMonthly, String LastOrder) throws FileNotFoundException { // a void method to insert a new item into the array
        arr[count] = new Item(nextItemNumber(), description, StockLeft, CostPrice, SellingPrice, SoldMonthly, LastOrder); // adding the item into the last position of the array
        count++; // increasing the size of the array
        saveToFile(); // saves the item added to the text file
    }

    public void DeleteItem(int ItemNum) throws FileNotFoundException { // a void method that deletes an item from the array and updates the file
        int j = ArrayPos(ItemNum); // looks for the position of the item in the array using the method ArrayPos
        for (int k = j; k < count - 1; k++) { // loop from the position of the item in the array till the end of the array
            arr[k] = arr[k + 1]; // shifts every elemet of the array to one position less
        }
        count = count - 1; // decreases the size of count since one item hs been removed
        saveToFile(); // saves the data with the deleted item into the file
    }

    public String getItemCode(int p) { // a typed method of the type String that returns the item code of the Item
        return "" + (arr[p].getItemNumber());
    }

    public String getDescription(int p) { // a typed method of the type String that returns the iDescription of the Item
        return "" + (arr[p].getDescription());
    }

    public String getDateLastOrder(int p) { // a typed method of the type String that returns the Date of last order of the Item
        return "" + (arr[p].getLastOrder());
    }

    public String getUnitsLeft(int p) { // a typed method of the type String that returns the number of units left of the Item
        return "" + (arr[p].getStockLeft());
    }

    public String getCostPrice(int p) { // a typed method of the type String that returns the cost price of the Item
        return "" + (arr[p].getCostPrice());
    }

    public String getSellingPrice(int p) { // a typed method of the type String that returns the selling price of the Item
        return  "" +(arr[p].getSellingPrice());
    }

    public int nextItemNumber() { // a typed method of the type intger that returns the next avaiable item number for a new item
        int number = 0; // an integer to store the next number
        number = arr[count - 1].getItemNumber() + 1; // the next number = the last number that already exists + 1
        return number; // returns the next number
    }

    public void saveToFile() throws FileNotFoundException { // A void method that saves the array into the text file
        PrintWriter outFile = new PrintWriter("Items.txt"); // creates the printwriter object that searches for the text file
        for (int i = 0; i < count; i++) { // looping throgh the array
            outFile.println(arr[i].getItemNumber() + "#" + arr[i].getDescription() + "#" + arr[i].getStockLeft() + "#" + arr[i].getCostPrice() + "#" + arr[i].getSellingPrice() + "#" + arr[i].getSoldMonthly() + "#" + arr[i].getLastOrder()); // adding a new row to the Text file with the details of the item seperated with a delimeter
        }
        outFile.close(); // closing the printwriter file

    }

    public double totalCost() { // A typed method of the typed double that calculates the total cost of the items in the past month
        double cost = 0; // a variable to store the cost
        for (int i = 0; i < count; i++) { //looping throght the array
            cost = cost + (arr[i].getCostPrice() * arr[i].getSoldMonthly()); // increasing the size of cost and adding the cost of all the items
        }
        return cost; // returns the value of cost
    }

    public double totalProfit() { //A typed method of the type double that returns total profit maade in the past month
        double profit = 0; // A variable to store the profit
        double cost; // a variable to store the cost
        double sum = 0; // a variable to store the sum of the profit
        double priceItem; // a variable to store price of the item

        for (int i = 0; i < count; i++) { // looping thrugh the array
            cost = (arr[i].getCostPrice() * arr[i].getSoldMonthly()); // calculating the cost of the item
            priceItem = (arr[i].getSellingPrice() * arr[i].getSoldMonthly()); // calculating the selling price total of the item
            sum = priceItem - cost; // calculating the profit of the item
            profit = profit + sum; // addin the sum of the profit of the items
        }
        return profit; // returning the total profit of all the items
    }



    public String runningLow() { // a typed method of the type String that returns a list of all the items running low on stock
        String items = ""; // a variable to store the list of items
        for (int i = 0; i < count; i++) { // looping through the array
            if (arr[i].getSoldMonthly() > arr[i].getStockLeft()) { // checking to see which items are runnung low
                items = items + arr[i].getDescription() + "\n";// adding the item to the list if it is runnung low 
            }
        }
     
        return items; // a list of all the items is returned
    }

    public double itemprice(String name, double price)  {// a typed method of the type double to get a items price with values inputted by user
        for (int i = 0; i <= count - 1; i++) {//loop from begin to the end of the array
            if (arr[i].getDescription().equals(name)) {//checking for the items price;
                price = arr[i].getSellingPrice();//geeting the price of the item and storing it as price
            }
        }
        return price;//returing the items price
    }

    public void EditItem(int itemNum, String description, int stockLeft, double costPerItem, double sellingPrice, int soldMonthly, String date) throws FileNotFoundException { // a void method that edits some details of the item
        Item l = SearchItem(itemNum); // Looks for the item that needs to be edited in the array
        for (int i = 0; i < count; i++) { // looping through the arrray 
            if (arr[i].getItemNumber() == l.getItemNumber()) { //compares the item number in the array to the item needing editing
                arr[i].EditItem(itemNum, description, stockLeft, costPerItem, sellingPrice, soldMonthly, date); // Editing the detils of the object
            }
        }
        saveToFile(); // saving the details in the file
    }

    public void updateFile(String item, int amount) throws FileNotFoundException { // a void method to update the number of items in the file
        for (int i = 0; i <= count - 1; i++) {//loop from begin to the end of the array
            if (arr[i].getDescription().equals(item)) {// checks to compare the description of the items
                arr[i].setStockLeft(arr[i].getStockLeft() - amount); // updates the stovk left
            }
        }
        saveToFile (); // saves the new data into the text file
    }

    public  String checkOut (double owe, double paid) {//a typed method for till ,to work out change for customer
        double change;// variable  to store the change required by customber
        String message = ""; // variable to store the message
        change = owe - paid;//calculating the change required by the user
        if (change < 0) {//checking if change is less than 0 thus the user still owes money
            change = change * -1;//making the change required  a positve number
           message = "Customber requires R" + change + " as change ";//notifying the user of the chnage required
        }
        if (change == 0) {//checking if amount paid is the correct amount for the items
            message =  "No change required";//sending a message
        }
        if (owe > paid) {//checking if the user has paid over
           message =  "Customber still owes R" + change + ".";//notifying user of the change required 

        }
        return message; 
    }

}
