package com.company.zkartshopping;

public class AdminInfo {
   static private String emailId="admin@zoho.com";
   static private String password="xyzzy";
    public static String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        AdminInfo.password = password;
    }
}
