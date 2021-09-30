package com.company.zkartshopping;

public class PrintOrderHistory {
    public static void printHistory(String email){
        if(Shopping.historyMap.get(email)!=null){
            System.out.println("InvoiceNumber    category    brand   Model    Price");
            System.out.println(Shopping.historyMap.get(email));
            System.out.println("Total cost"+OrderHistory.getTotalCost());
        }
    }
}
