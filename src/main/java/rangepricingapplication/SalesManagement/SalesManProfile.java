package rangepricingapplication.SalesManagement;

import rangepricingapplication.Business.Business;
import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.ProductManagement.Product;

import java.util.ArrayList;

public class SalesManProfile {
    EmployeeProfile employee;
    Business business;

    ArrayList<OrderItem> salesProduct;

    public SalesManProfile(EmployeeProfile employee) {
        this.employee = employee;
        salesProduct=new ArrayList<>();
    }

    public void  addProduct4Sale(OrderItem orderItem)
    {
        salesProduct.add(orderItem);
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }


    public int calcSalesVolume() {
        int sum=0;
        for(OrderItem orderItem:salesProduct)
        {
           sum+= orderItem.getQuantity();
        }

        return sum;
    }

    public int calcSalesPricePerf()
    {
        int sum=0;
        for(OrderItem orderItem:salesProduct)
        {
            sum+= orderItem.calculatePricePerformance();
        }

        return sum;
    }
}
