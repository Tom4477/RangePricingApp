package rangepricingapplication.SalesManagement;

import rangepricingapplication.Business.Business;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.ProductManagement.Product;

import java.util.ArrayList;

public class SalesManProfile {
    EmployeeProfile employee;
    Business business;
    Integer salesVolume;
    Integer pricePerformance;
    ArrayList<Product> salesProduct;

    public SalesManProfile(EmployeeProfile employee) {
        this.employee = employee;
        salesProduct=new ArrayList<>();
    }

    public void  addProduct4Sale(Product product)
    {
        salesProduct.add(product);
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getPricePerformance() {
        return pricePerformance;
    }

    public void setPricePerformance(Integer pricePerformance) {
        this.pricePerformance = pricePerformance;
    }
}
