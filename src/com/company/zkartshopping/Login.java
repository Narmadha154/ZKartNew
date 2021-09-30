package com.company.zkartshopping;
public class Login {

    public static boolean accountLogin(String emailId, String password){
        if(CreateObject.map.get(emailId)==null){
            return false;
        }
        else{
            Customer details=CreateObject.map.get(emailId);
            String pass=details.getEncryptedPwd();
            String newPass="";
            for(int j=0;j<password.length();j++){
                if(password.charAt(j)!='z'&&password.charAt(j)!='Z'&&password.charAt(j)!='9'){
                    newPass+= (char) (((int) password.charAt(j) + 1));
                }
                else if(password.charAt(j)=='z'){
                    newPass+='a';
                }
                else if(password.charAt(j)=='Z'){
                    newPass+='A';
                }
                else if(password.charAt(j)=='9'){
                    newPass+='0';
                }
            }
            System.out.println(newPass);
            if(newPass.equals(pass)){
                return true;
            }
            else{
                System.out.println("password doesn't match");
            }
        }
        return false;
    }
    public static AdminInfo initializeAdminInfo(){
        AdminInfo info=new AdminInfo();
        info.setEmailId("admin@zoho.com");
        info.setPassword("xyzzy");
        return info;
    }
    public static AdminInfo getInfo(){
        AdminInfo info=initializeAdminInfo();
        return info;
    }
}
