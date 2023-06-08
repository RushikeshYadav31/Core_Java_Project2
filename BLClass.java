package ShopApplication;

import java.util.*;

public class BLClass {
    static List<Shop> shopList=new ArrayList<>();
    static Product p1=new Product();
    static Shop s1=new Shop();
    public void addNewShop(Shop s){
     shopList.add(s);
    }
    public void addInExisting(Shop s,Product p){
     for(Shop s1:shopList){
      if(s1.getsId()==s.getsId()){
       s1.addProduct(p);
          System.out.println("Added");
      }
     }
    }
    public void displayAllShop(){
        for(Shop s:shopList){
            System.out.println(s.getsId()+"  "+s.getsName()+"  "+s.getstype()+"  "+s.getProduct());
        }
    }
    public void displayOneShop(Shop s){
          for (Shop list:shopList){
              if(list.getsId()==s.getsId()){
                  System.out.println(list.getsId()+"  "+list.getsName()+"  "+list.getstype()+"  "+list.getProduct());
              }
          }
    }
    public void displayAllProduct(Shop s){
        for(Shop list:shopList){
           if(list.getsId()==s.getsId()){
               System.out.println(list.getProduct());
           }
        }
    }
    public void displayOneProduct(Shop s,Product p){
       for(Shop list:shopList){
           if(list.getsId()==s.getsId()){
               for(int i=0;i<shopList.size();i++) {
                  for(Product p1:shopList.get(i).getProduct()){
                      if(p1.getpId()==p.getpId()){
                          System.out.println(p1.getpId()+"  "+p1.getpName()+"  "+p1.getpPrice());
                      }
                  }
               }
           }
       }
    }
    public void updateShopName(Shop s){
       for (int i=0;i<shopList.size();i++){
           if(shopList.get(i).getsId()==s.getsId()){
               shopList.get(i).setsName(s.getsName());
               System.out.println("Shop Name Updated");
           }
       }
    }
    public void updateProductPrice(Shop s,Product p){
         for (int i=0;i<shopList.size();i++){
             if(shopList.get(i).getsId()==s.getsId()){
                 if(shopList.get(i).getProduct().get(i).getpId()==p.getpId()){
                     shopList.get(i).getProduct().get(i).setpPrice(p.getpPrice());
                     System.out.println("Update Price Updated");
                 }
             }
         }
    }
    public void deleteShop(Shop s){
        for(Shop list:shopList){
            if(list.getsId()==s.getsId()){
                shopList.remove(list);
            }
        }
    }
    public void deleteProduct(Shop s,Product p){
        for(Shop list:shopList){
            if(list.getsId()==s.getsId()){
                for(int i=0;i<shopList.size();i++){
                    if(shopList.get(i).getProduct().get(i).getpId()==p.getpId()){
                        shopList.remove(i);
                    }
                }
            }
        }
    }
}
