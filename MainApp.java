package ShopApplication;

import java.util.*;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static BLClass bl = new BLClass();
    public static void main(String[] args) {
       boolean status=true;
       while (status){
           System.out.println("Select The Mode Of Operation");
           System.out.println("1. Add Operation");
           System.out.println("2. Update Operation");
           System.out.println("3. Display Operation");
           System.out.println("4. Delete Operation");
           System.out.println("5. Exit");
           int option=sc.nextInt();
           switch (option){
               case 1:
                   addOperation();
                   break;
               case 2:
                   UpdateOperation();
                   break;
               case 3:
                   displayOperation();
                   break;
               case 4:
                   deleteOperation();
                   break;
               case 5:
                   status=false;
                   break;
               default:
                   System.out.println("Invalid Operation !!");
           }
       }
    }
    private static void addOperation(){
        boolean status=true;
        while (status){
            System.out.println("Select Add Operation Mode");
            System.out.println("1. Add New Shop");
            System.out.println("2. Add Product In Existing Shop");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    addNewShop();
                    break;
                case 2:
                    addInExisting();
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid !!");
            }
        }
    }
    private static void addNewShop(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        System.out.println("Enter Shop Name");
        String sName=sc.next();
        System.out.println("Enter Shop Type");
        String sType=sc.next();

        Shop s1=new Shop();
        s1.setsId(sId);
        s1.setsName(sName);
        s1.setstype(sType);
        boolean status=true;
        while (status){
            System.out.println("Select the Option");
            System.out.println("1. Add Product");
            System.out.println("2. Save Details");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    Product product=addProduct();
                    s1.addProduct(product);
                    break;
                case 2:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
        bl.addNewShop(s1);
    }
    public static Product addProduct(){
        System.out.println("Enter Product ID");
        int pId=sc.nextInt();
        System.out.println("Enter Product Name");
        String pName=sc.next();
        System.out.println("Enter Product Price");
        double pPrice=sc.nextDouble();
        return new Product(pId,pName,pPrice);
    }
    private static void addInExisting(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        System.out.println("Enter Product Id");
        int pId=sc.nextInt();
        System.out.println("Enter Product Name");
        String pName=sc.next();
        System.out.println("Enter Product Price");
        double pPrice=sc.nextDouble();
        Shop s = new Shop();
        Product p = new Product();
        s.setsId(sId);
        p.setpId(pId);
        p.setpName(pName);
        p.setpPrice(pPrice);
        bl.addInExisting(s,p);
    }
    private static void displayOperation(){
        boolean status=true;
        while (status){
            System.out.println("1. Display Shop");
            System.out.println("2. Display Product");
            System.out.println("3. Abort Display Operation");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    displayShop();
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid Display Operation");
            }
        }
    }
    private static void displayShop(){
        boolean status=true;
        while (status){
            System.out.println("1. Display All Shop");
            System.out.println("2. Display One Shop");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    displayAllShop();
                    break;
                case 2:
                    displayOneShop();
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    private static void displayAllShop(){
        bl.displayAllShop();
    }
    private static void displayOneShop(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        Shop s=new Shop();
        s.setsId(sId);
        bl.displayOneShop(s);
    }
    private static void displayProduct(){
        boolean status=true;
        while (status){
            System.out.println("1. Display All Product In Shop");
            System.out.println("2. Display One Product In Shop");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    displayAllProduct();
                    break;
                case 2:
                    displayOneProduct();
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    private static void displayAllProduct(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        Shop s = new Shop();
        s.setsId(sId);
        bl.displayAllProduct(s);
    }
    private static void displayOneProduct(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        System.out.println("Enter Product Id");
        int pId=sc.nextInt();
        Shop s = new Shop();
        Product p = new Product();
        s.setsId(sId);
        p.setpId(pId);
        bl.displayOneProduct(s,p);
    }
    private static void UpdateOperation(){
        boolean status=true;
        while (status){
            System.out.println("1. Update Shop");
            System.out.println("2. Update Product");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    updateShop();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    private static void updateShop(){
       boolean status=true;
       while (status){
           System.out.println("1. Update Shop Name");
           System.out.println("2. Exit");
           int option=sc.nextInt();
           switch (option){
               case 1:
                   updateShopName();
                   break;
               case 2:
                   status=false;
                   break;
               default:
                   System.out.println("Invalid");
           }
       }
    }
    private static void updateShopName(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        System.out.println("Enter New Shop Name");
        String sName=sc.next();
        Shop s = new Shop();
        s.setsId(sId);
        s.setsName(sName);
        bl.updateShopName(s);
    }
    private static void updateProduct(){
      boolean status=true;
      while (status){
          System.out.println("1. Update Product Price");
          System.out.println("2. Exit");
          int option=sc.nextInt();
          switch (option){
              case 1:
                  updateProductPrice();
                  break;
              case 2:
                  status=false;
                  break;
              default:
                  System.out.println("Invalid");
          }
      }
    }
    private static void updateProductPrice(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        System.out.println("Enter Product Id");
        int pId=sc.nextInt();
        System.out.println("Enter Product New Price");
        double pPrice=sc.nextDouble();
        Shop s=new Shop();
        Product p = new Product();
        s.setsId(sId);
        p.setpId(pId);
        p.setpPrice(pPrice);
        bl.updateProductPrice(s,p);
    }
    private static void deleteOperation(){
        boolean status=true;
        while (status){
            System.out.println("1. Delete Shop");
            System.out.println("2. Delete Product");
            System.out.println("3. Exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    deleteShop();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    private static void deleteShop(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        Shop s = new Shop();
        s.setsId(sId);
        bl.deleteShop(s);
    }
    private static void deleteProduct(){
        System.out.println("Enter Shop Id");
        int sId=sc.nextInt();
        System.out.println("Enter Product Id");
        int pId=sc.nextInt();
        Shop s=new Shop();
        Product p=new Product();
        s.setsId(sId);
        p.setpId(pId);
        bl.deleteProduct(s,p);
    }
}
