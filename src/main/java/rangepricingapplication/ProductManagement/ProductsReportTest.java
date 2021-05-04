package rangepricingapplication.ProductManagement;

class ProductsReportTest {



    public static void main(String[] args) {

        ProductsReport productsReport=new ProductsReport();

        ProductSummary[] productSummaries_pricePer=productsReport.getTop10PricePerf();
        System.out.println(productSummaries_pricePer);

        ProductSummary[] productSummaries_volume=productsReport.getTop10SalesVolume();
        System.out.println(productSummaries_volume);


    }

}
