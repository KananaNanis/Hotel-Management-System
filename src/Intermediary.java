
import java.util.ArrayList;

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
public class Intermediary {
    ArrayList names,price,roomNum,roomHall;
    
    public Intermediary() {
    names = new ArrayList();
    price = new ArrayList();
    
    roomNum = new ArrayList();
    roomHall = new ArrayList();
}
    //Accessor method to get the names
    public ArrayList  getNamesList(){
        return names;
    }
    
    //Accessor method to get the price
   public ArrayList  getPriceList(){
        return price;
    }
   
   //Accessor method to get the roomNum
   public ArrayList  getRoomNum(){
        return roomNum;
    }
   
   //Accessor method to get the roomHall
   public ArrayList  getRoomHall(){
        return roomHall;
    }
    
}
