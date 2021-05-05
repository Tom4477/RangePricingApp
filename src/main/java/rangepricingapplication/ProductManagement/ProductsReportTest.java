package rangepricingapplication.ProductManagement;

import rangepricingapplication.OrderManagement.OrderItem;

class ProductsReportTest {



    public static void main(String[] args) {

        Product product1=new Product(10,13,12);

        ProductCatalog catalog=new ProductCatalog();
        OrderItem orderItem1=new OrderItem(product1,10);

          catalog.newProduct(10,30,20);

       ProductsReport productsReport=new ProductsReport();
     //  productsReport=catalog.generatPerformanceReport();



//        ProductSummary[] productSummaries_pricePer=productsReport.getTop10PricePerf();
//        System.out.println(productSummaries_pricePer);
//
//        ProductSummary[] productSummaries_volume=productsReport.getTop10SalesVolume();
//        System.out.println(productSummaries_volume);

    }

}
