package rangepricingapplication.Supplier;

import com.github.javafaker.Faker;
import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;
import rangepricingapplication.ProductManagement.Product;
import rangepricingapplication.ProductManagement.ProductCatalog;

import java.util.Random;

public class SupplyTest {

    static int NumOfItem=50;
    public static void main(String[] args) {

        Faker faker = new Faker();
        Random random=new Random();
        Order order=new Order();
        SupplierReport supplierReport=new SupplierReport();

        for(int i=0;i<NumOfItem;i++)
        {
            ProductCatalog productCatalog=new ProductCatalog();
            Product product= productCatalog.newProduct(10+random.nextInt(10),30+random.nextInt(10),20+random.nextInt(10));
            OrderItem orderItem=order.newOrderItem(product,20+random.nextInt(10),random.nextInt(20));
            Supplier supplier=new Supplier(faker.name().fullName());
            supplier.setProductcatalog(productCatalog);
            SupplierSummary tempSummary=new SupplierSummary(supplier);
            supplierReport.addSupplierSummary(tempSummary);
            
        }

        System.out.println("-----------------------------sales volume--------------------------------------");
        SupplierSummary[] supplierSummaries=supplierReport.genTop10SupBySalesVolume();

        for (SupplierSummary supplierSummary : supplierSummaries) {
            System.out.println(supplierSummary.getSalesvolume()+"///"+supplierSummary.getSupplier().name);
        }


    }
}
