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
}
