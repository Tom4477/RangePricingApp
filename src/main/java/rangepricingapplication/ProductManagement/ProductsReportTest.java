package rangepricingapplication.ProductManagement;

class ProductsReportTest {



    public static void main(String[] args) {

        ProductCatalog catalog=new ProductCatalog();

        for(int i=0;i<20;i++)
          catalog.newProduct(10+i,30+2*i,20+2*i);

        ProductsReport productsReport=catalog.generatPerformanceReport();

        ProductSummary[] productSummaries_pricePer=productsReport.getTop10PricePerf();
        System.out.println(productSummaries_pricePer);

        ProductSummary[] productSummaries_volume=productsReport.getTop10SalesVolume();
        System.out.println(productSummaries_volume);

    }

}
