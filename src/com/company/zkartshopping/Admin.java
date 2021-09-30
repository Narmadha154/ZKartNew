package com.company.zkartshopping;

import java.util.Scanner;

public class Admin {
    public static void adminCheck(){
        Scanner sc=new Scanner(System.in);
            for(int i=0;i<Shopping.proList.size();i++) {
                Product details = Shopping.proList.get(i);
                if (details.getStock() < 10) {
                    System.out.println(details);
                    System.out.println("Enter the "+ details.getBrand()+"quantity to reorder");
                    int number=sc.nextInt();
                    details.setStock(details.getStock()+number);
                }
            }
    }
}
