
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Claire Chemutai
 * @author Nanis Kanana
 */
public final class TableUsingArrayList {

    private int id;
    private String foodName;
    private double price;
    OrderFood orderFood;
    //ViewMenu viewMenu;
    ArrayList<FoodDetail> theList;
    ViewMenu viewMenu;

    
    
    public TableUsingArrayList(OrderFood orderFood) {
        this.orderFood = orderFood;
        
        theList = new ArrayList<>();
        addToTable();
    }
    
    public TableUsingArrayList(ViewMenu viewMenu) {
        this.viewMenu =viewMenu;
        //this.viewMenu=viewMenu;
        theList = new ArrayList<>();
        addToTable2();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void foodMenu() {
        
        theList.add(new FoodDetail(1, "Ugali", 15.00));
        theList.add(new FoodDetail(2, "Chapati", 10.50));
        theList.add(new FoodDetail(3, "Mukimo", 23.34));
        theList.add(new FoodDetail(4, "Banku", 12.00));
        theList.add(new FoodDetail(5, "Rice", 8.50));
    }

    public void addToTable() {
        foodMenu();
        DefaultTableModel model = (DefaultTableModel) orderFood.foodTableDisplay.getModel();
        //DefaultTableModel model2 = (DefaultTableModel) viewMenu.foodTableDisplay.getModel();
        
        
        for (int i = 0; i < theList.size(); i++) {
            Object rowData[] ={theList.get(i).getID(),theList.get(i).getName(),theList.get(i).getPrice()};
            model.addRow(rowData);
        }
           }

    public void addToTable2() {
        foodMenu();
        DefaultTableModel model2 = (DefaultTableModel) viewMenu.foodTableDisplay.getModel();
        //DefaultTableModel model2 = (DefaultTableModel) viewMenu.foodTableDisplay.getModel();
        
        
        for (int i = 0; i < theList.size(); i++) {
            Object rowData[] ={theList.get(i).getID(),theList.get(i).getName(),theList.get(i).getPrice()};
            model2.addRow(rowData);
        }
        
    }

    
    private class FoodDetail {
        int id;
        String name;
        double price;

        FoodDetail(int id, String foodName, double price) {
            this.id = id;
            this.name = foodName;
            this.price = price;
        }

        int getID() {
            return this.id;
        }

        String getName() {
            return name;
        }

        double getPrice() {
            return price;
        }
    }

}
