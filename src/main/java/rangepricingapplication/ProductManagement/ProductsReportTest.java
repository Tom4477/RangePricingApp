package rangepricingapplication.ProductManagement;

import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;

import java.util.Random;

class ProductsReportTest {

    static int NumOfItem=50;
    public static void main(String[] args) {

        Random random=new Random();
        ProductsReport productsReport=new ProductsReport();
        Order order=new Order();

        for(int i=1;i<=NumOfItem;i++)
        {
            Product testPro=new Product(10+random.nextInt(10),30+random.nextInt(10),20+random.nextInt(10));
            OrderItem orderItem=order.newOrderItem(testPro,20+random.nextInt(10),random.nextInt(20));
            ProductSummary productSummary =new ProductSummary(testPro);
            productsReport.addProductSummary(productSummary);
        }
        System.out.println("-----------------------------sales volume--------------------------------------");

        ProductSummary [] finalSummaryBySV=productsReport.getTop10ProductSalesVolume();
        for(ProductSummary productSummary:finalSummaryBySV)
        System.out.println(productSummary.salesvalume+"///"+productSummary.subjectproduct.toString());

        System.out.println("-----------------------------price Performance--------------------------------------");

        ProductSummary [] finalSummaryByPP=productsReport.getTop10ProductPricePerf();
        for(ProductSummary productSummary:finalSummaryByPP)
            System.out.println(productSummary.pricePerformance+"///"+productSummary.subjectproduct.toString());

    }
}
