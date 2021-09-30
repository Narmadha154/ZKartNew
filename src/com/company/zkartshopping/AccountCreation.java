package com.company.zkartshopping;
import java.io.FileWriter;
import java.io.IOException;
public class AccountCreation {
        public static boolean checkAccount(String email){
            if(CreateObject.map.get(email)==null){
                return true;
            }
            return false;
        }
        public static boolean createAccount(String email,Customer details){
            CreateObject.map.put(email,details);
           try(FileWriter writer=new FileWriter("/home/inc11/IdeaProjects/ZKart/src/com/company/zkartshopping/customerdetails",true)){
              writer.write("\n");
              writer.write(email+"     ");
              writer.write(String.valueOf(details));
        }
        catch(IOException e){
            e.printStackTrace();
        }
            return true;
        }
    }
