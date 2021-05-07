/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import rangepricingapplication.ProductManagement.Product;
import rangepricingapplication.ProductManagement.ProductCatalog;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
    public Supplier(String n){
        name = n;
        productcatalog = new ProductCatalog();

    }
    public int getOrderSalesVolume() {
        int sum = 0;
        ArrayList<Product> products=productcatalog.getProducts();
        for (Product oi : products) {
            sum = sum + oi.getOrderSalesVolume();
        }
        return sum;
    }
    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }
}
