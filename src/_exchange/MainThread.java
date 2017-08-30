/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _exchange;

/**
 *
 * @author ueda
 */
public class MainThread extends Customer {
    
    private void exchange(){
        productName(); 
        checkOut();
        printToString();
    }
    
    public static void main(String[] args) {
         MainThread main= new MainThread();
         main.setId("01");
         main.setAvatar("Yellow");
         main.setBalance("2000$");
         main.setEmail("danhnbd@master.top.co");
         main.setName("Nguyễn Bá Danh");
         main.setStatus("No problem");
         
        main.exchange();
         
        
    }
    
    
}
