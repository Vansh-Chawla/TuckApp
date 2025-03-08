
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vansh Chawla
 */
public class Item {

    private int ItemNumb; //creating a new integer to store Item Number
    private String Description;// creating a new String to store Item Description
    private int StockLeft;//Creating a new Integer to store the number of units left
    private double CostPrice;// Creating a new double to store the cost price of the item
    private double SellingPrice;// Creating a new double to store the selling price of the item
    private int SoldMonthly;// creating a new integer value to store the number of units sold monthly
    private String LastOrder;// creating a new String to store the date of last order

    public Item(int itemNumber, String description, int stockLeft, double costPrice, double sellingPrice, int soldMonthly, String lastOrder) {// creating a constructor to assign values to all the variables 
        ItemNumb = itemNumber; // setting item number 
        Description = description; // setting item description
        StockLeft = stockLeft; // setting stock left
        CostPrice = costPrice;  // setting cost price
        SellingPrice = sellingPrice; //setting selling price
        SoldMonthly = soldMonthly; // setting units sold monthly
        LastOrder = lastOrder; // setting date of last order

    }

    public Item() { // creating a non-paramatised constructor 
    }

    public int getItemNumber() { // creating a typed method that returns the integer Item Number
        return ItemNumb;
    }

    public String getDescription() { // creating a typed method that returns a String Description
        return Description;
    }

    public int getStockLeft() { // creating a typed method that returns an integer showing the number of units left
        return StockLeft;
    }

    public Double getCostPrice() { // creating a typed method that returns the double value of the cost price
        return CostPrice;
    }

    public double getSellingPrice() { // creating a typed method that returns the double value of the selling price 
        return SellingPrice;
    }

    public int getSoldMonthly() {  // creating a typed method that returns the integer value of the number of units sold monthly
        return SoldMonthly;
    }

    public String getLastOrder() { // creating a typed method that returns the String date of last order
        return LastOrder;
    }

    public void setDescription(String desc) { // A void method that sets a description to the object
        Description = desc;
    }

    public void setStockLeft(int StockLeft) { // A void method that sets the number of units left to the object
        this.StockLeft = StockLeft;
    }

    public void setCostPrice(double costPrice) { // A void method that sets the cost price of the item to the object
        CostPrice = costPrice;
    }

    public void setSellingPrice(double sellingPrice) { // A void method that sets the selling price of the item to the object
        SellingPrice = sellingPrice;
    }

    public void setSoldMonthly(int soldMonthly) { // A void method that sets the number of units sold monthly to the object
        SoldMonthly = soldMonthly;
    }

    public void setLastOrder(String lastOrder) { // A void method that sets the date of last order to the object
        LastOrder = lastOrder;
    }

    public void EditItem(int itemNumber, String description, int stockLeft, double costPrice, double sellingPrice, int soldMonthly, String lastOrder) { // A void method to edit the fields of the object
        ItemNumb = itemNumber; // changing the itemnumber
        Description = description; // changing the description
        StockLeft = stockLeft; // changing the units left
        CostPrice = costPrice; // changing the cost price
        SellingPrice = sellingPrice; // changing the selling pric
        SoldMonthly = soldMonthly; // chaning the number of units sold monthly
        LastOrder = lastOrder; // changing the date of last order

    }

}
