/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.ProductManagement;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author kal bugrara
 */
public class ProductsReport {

    ArrayList<ProductSummary> productsummarylist;
    public ProductsReport(){
        productsummarylist=new ArrayList<>();
    }
    public void addProductSummary(ProductSummary ps){

    productsummarylist.add(ps);
}

    public ProductSummary getTopProductAboveTarget(){
        ProductSummary currenttopproduct = null;

        for (ProductSummary ps: productsummarylist){
            if(currenttopproduct == null)currenttopproduct = ps; // initial step
            else
                if(ps.getNumberAboveTarget()> currenttopproduct.getNumberAboveTarget()){
                currenttopproduct = ps; //we have a new higher total
            }

                }
        return currenttopproduct;
    }


}
