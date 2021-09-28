package com.company.zkartshopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerDetails {
    public static Map createCustomerDetails(){
        Map<String,Customer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers want to add");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            sc.nextLine();
            System.out.println("Enter your name:");
            String name=sc.nextLine();
            System.out.println("Enter the emailId:");
            String email=sc.nextLine();
            System.out.println("Enter the password:");
            String password=sc.nextLine();
            System.out.println("Enter the mobile number");
            long mobile=sc.nextLong();
            String newPass="";
            int k=0;
            for(int j=0;j<password.length();j++){
               newPass+=(char)(((int)password.charAt(j)+1));
            }
            System.out.println(newPass);
            Customer details=new Customer();
            details.setName(name);
            details.setEmailId(email);
            details.setEncryptedPwd(newPass);
            details.setMobileNo(mobile);
            map.put(email,details);
        }
        System.out.println(map);
        return map;
    }
}
