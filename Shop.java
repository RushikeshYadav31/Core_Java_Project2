package ShopApplication;

import java.util.*;

public class Shop {
    private int sId;
    private String sName="A";
    private String sType;
    private List<Product> productList=new ArrayList<>();

    public Shop(){}
    public Shop(int sId, String sName, String sType, List<Product> product) {
        this.sId = sId;
        this.sName = sName;
        this.sType = sType;
        this.productList = product;
    }
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getstype() {
        return sType;
    }

    public void setstype(String sType) {
        this.sType = sType;
    }

    public List<Product> getProduct() {
        return productList;
    }
    public void addProduct(Product p) {
        this.productList.add(p);
    }
    public  String toStirng(){
        return sId+"  "+sName+"  "+sType+"  "+productList;
    }
}
