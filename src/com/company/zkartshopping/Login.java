package com.company.zkartshopping;

import java.util.Map;

public class Login {
    public static boolean accountLogin(String emailId, String pass){
        if(CreateObject.map.get(emailId)==null){
            return false;
        }
        else{
            Customer details=CreateObject.map.get(emailId);
            String password=details.getEncryptedPwd();
            String decryptedPass="";
            for(int i=0;i<password.length();i++){
                decryptedPass+=(char)((int)password.charAt(i)-1);
            }
            System.out.println(decryptedPass);
            if(decryptedPass.equals(pass)){
                return true;
            }
            else{
                System.out.println("password doesn't match");
            }
        }
        return false;
    }
}
