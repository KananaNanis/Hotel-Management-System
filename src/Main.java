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
public class Main {
    public static void main(String[] args){
       
        Intermediary inter = new Intermediary();
        UserIdentification id = new UserIdentification(inter);
        id.setVisible(true);
        

       
    }
}

