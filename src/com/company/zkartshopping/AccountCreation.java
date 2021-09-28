package com.company.zkartshopping;

import java.util.Map;

public class AccountCreation {
    public static void createAccount(Map<String,Customer> map,String email,Customer details){
         if(map.get(email)==null){
             map.put(email,details);
         }
         else{
             System.out.println("Account already exists..please login");
         }
    }
}
