/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import rangepricingapplication.ProductManagement.ProductCatalog;

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
}
