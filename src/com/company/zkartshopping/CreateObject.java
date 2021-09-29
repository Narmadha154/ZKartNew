package com.company.zkartshopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CreateObject {
    static Map<String,Customer> map=new HashMap<>();
    static Map<String, ArrayList<Product>> proMap=new HashMap<>();
    public static void setCustomerObject(){
        for(int i=0;i< Runner.customerList.size();i++){
            int j=0;
            Customer details=new Customer();
            String [] arr=Runner.customerList.get(i).split("     ");
            details.setEmailId(arr[j++]);
            details.setEncryptedPwd(arr[j++]);
            details.setName(arr[j++]);
            details.setMobileNo(arr[j++]);
            map.put(details.getEmailId(),details);
        }
        System.out.println(map);
    }
    public static void setProductObject(){
        for(int i=0;i< Runner.productList.size();i++){
            int j=0;
            ArrayList<Product> list=new ArrayList<>();
            Product pros=new Product();
            String [] arr=Runner.productList.get(i).split("     ");
            String category=arr[j++];
            pros.setBrand(arr[j++]);
            pros.setModel(arr[j++]);
            pros.setPrice(Integer.parseInt(arr[j++]));
            pros.setStock(Integer.parseInt(arr[j++]));
            list.add(pros);
            if(proMap.get(category)==null) {
                proMap.put(category,list);
            }
            else{
                ArrayList<Product> newList=new ArrayList<>();
                ArrayList< Product> details=proMap.get(category);
                Product det=details.get(0);
                newList.add(det);
                newList.add(pros);
                proMap.put(category,newList);
            }
        }
        System.out.println(proMap);
    }
}
