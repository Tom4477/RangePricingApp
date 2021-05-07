package rangepricingapplication.ProductManagement;

import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;

import java.util.Random;

class ProductsReportTest {

    static int NumOfItem=10;
    public static void main(String[] args) {

        Product testPro=new Product(10,30,20);
        Random random=new Random();
        ProductsReport productsReport=new ProductsReport();
        Order order=new Order();

        for(int i=1;i<=NumOfItem;i++)
        {
            OrderItem orderItem=order.newOrderItem(testPro,15+random.nextInt(10),random.nextInt(20));
            System.out.println(orderItem.isActualAboveTarget());
            ProductSummary productSummary =new ProductSummary(testPro);
            productsReport.addProductSummary(productSummary);
        }

        ProductSummary finalSummary=productsReport.getTopProductAboveTarget();
        System.out.println(finalSummary.getNumberAboveTarget());

    }
}
