package com.company.zkartshopping;

import java.io.*;
import java.util.*;

public class CustomerDetails {
    public static List<String> readCustomerDetailsFromFile() {
        List<String> list = new ArrayList<>();
        File file = new File("/home/inc11/IdeaProjects/ZKart/src/com/company/zkartshopping/customerdetails");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> readProductDetailsFromFile() {
        List<String> list = new ArrayList<>();
        File file = new File("/home/inc11/IdeaProjects/ZKart/src/com/company/zkartshopping/z-kart_db");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
       /* Scanner sc=new Scanner(System.in);
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
            Runner.map.put(email,details);
        }*/
}
