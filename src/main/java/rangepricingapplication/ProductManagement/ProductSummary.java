/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.ProductManagement;

/**
 *
 * @author kal bugrara
 */
//this class will extract summary data from the product
public class ProductSummary {
    Product subjectproduct;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int salesvalume;
    int pricePerformance;
    int rank; // will be done later

    public ProductSummary(Product p){

        numberofsalesabovetarget = p.getNumberOfProductSalesAboveTarget();
        salesvalume = p.getOrderSalesVolume();
        pricePerformance=p.getOrderPricePerformance();
        subjectproduct = p; //keeps track of the product itself not as well;

    }

    public int getNumberAboveTarget() {
        return numberofsalesabovetarget;
    }

    public int getNumberBelowTarget() {
        return numberofsalesbelowtarget;
    }

    public int getSalesvalume() {
        return salesvalume;
    }

    public int getPricePerformance() {
        return pricePerformance;
    }
}
