/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _exchange;

import java.util.Scanner;
public class Customer {
    private String id;
    private String name;
    private String email;
    private String balance;//Tiền trong tài khoản
    private String avatar;
    private String status;

    public Customer() {
    }

    public Customer(String id, String name, String email, String balance, String avatar, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.avatar = avatar;
        this.status = status;
    }
      

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //in ra khách hàng đã chọn sản phẩm
    public void productName(){
        System.out.println("Nhập tên sản phẩm: ");
        Scanner scanner=new Scanner(System.in);
        String productName=scanner.nextLine();
        System.out.println("khách hàng đã chọn sản phẩm "+productName);
    }
    
    public void checkOut(){
        System.out.println("Người dùng thực hiện thanh toán hóa đơn");    
    }
    

    @Override
    public String toString() {
        return "==========Customer==========\n" + "id: " + id + "\nName: " + name + "\nEmail: " + email + "\nBalance: " + balance + "\nAvatar: " + avatar + "\nStatus: " + status ;
    }
    
    public void printToString(){
        System.out.println(toString());
    }

  
    
    
    
}
