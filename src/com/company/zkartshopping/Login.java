package com.company.zkartshopping;

import java.util.Map;

public class Login {
    public static String accountLogin(String emailId, String pass, Map<String,Customer> map){
        String name="";
        if(map.get(emailId)==null){
            System.out.println("Account not exists..please create the account");
        }
        else{
            Customer details=map.get(emailId);
            String password=details.getEncryptedPwd();
            String decryptedPass="";
            for(int i=0;i<password.length();i++){
                decryptedPass+=(char)((int)password.charAt(i)-1);
            }
            System.out.println(decryptedPass);
            if(decryptedPass.equals(pass)){
                name=details.getName();
                System.out.println("Login successfully");

            }
            else{
                System.out.println("password not matched");
            }
        }
        return name;
    }
}
