package org.example.BillingManagementSoftware;

import java.util.ArrayList;
import java.util.List;




public class Cart {
    //private Product product;
    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void add(Product product) {
        listOfProducts.add(product);
    }

    public void removeProduct(int idx) {
        if(idx>=1 && idx < listOfProducts.size())
        listOfProducts.remove(idx-1);
    }
}
