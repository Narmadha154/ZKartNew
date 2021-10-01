package com.company.zkartshopping;
import java.util.*;
public class Shopping {
    static Map<String,ArrayList<OrderHistory>> historyMap=new HashMap<>();
    static int number=15000;
    static int amount=0;
    static List<OrderHistory> kart=new ArrayList<>();
    static List<Product> proList=new ArrayList<>();
    public static void shopProduct(String email){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the category:");
        String category=sc.nextLine();
        List<Product> list=new ArrayList<>();
        if(CreateObject.proMap.get(category)!=null) {
            list =CreateObject.proMap.get(category);
        }
        else{
            System.out.println("category not found");
            return;
        }
        System.out.println(list);
        System.out.println("Enter the brand");
        String brand=sc.nextLine();
        System.out.println("Enter the model");
        String model=sc.nextLine();
        System.out.println("Enter the quantity:");
        int quantity=sc.nextInt();
        OrderHistory history=new OrderHistory();
        for(int i=0;i<list.size();i++){
            Product pro=list.get(i);
            if(pro.getBrand().equals(brand)&&pro.getModel().equals(model)){
                if(pro.getStock()>=quantity){
                    amount+=pro.getPrice()*quantity;
                    int stock = pro.getStock();
                    stock-=quantity;
                    pro.setStock(stock);
                    number+=100;
                    history.setInvoiceNumber(number);
                    history.setCategory(category);
                    history.setBrand(brand);
                    history.setModel(model);
                    history.setPrice(pro.getPrice());
                    kart.add(history);
                    proList.add(pro);
                    System.out.println("Do you want to continue to purchase or add any item or cancel the process");
                    System.out.println("Enter 1 to continue purchase:");
                    System.out.println("Enter 2 to add any item:");
                    System.out.println("Enter 3 to cancel the process");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("your order is placed");
                        historyMap.put(email, (ArrayList<OrderHistory>) kart);
                        history.setTotalCost(amount);
                        amount=0;
                        kart=new ArrayList<>();
                        return;
                    }
                    else if(choice==2) {
                        shopProduct(email);
                    }
                    else if(choice==3){
                        return;
                    }
                }
                else{
                    System.out.println("Product stock is not enough..."+"only"+ pro.getStock()+"available" );
                }
            }
            else if(!pro.getBrand().equals(brand)){
                System.out.println("brand not matched");
            }
            else if(!pro.getModel().equals(model)){
                System.out.println("model not matched");
            }
        }
    }
}
