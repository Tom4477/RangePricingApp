package rangepricingapplication.SalesManagement;

public class SalesSummary {

    SalesManProfile salesMan;
    int salesvolume;
    int pricePerformance;

    public SalesSummary(SalesManProfile smp) {
        pricePerformance=smp.calcSalesPricePerf();
        salesvolume=smp.calcSalesVolume();
        salesMan = smp;
    }

    public int getSalesvolume() {
        return salesvolume;
    }

    public int getPricePerformance() {
        return pricePerformance;
    }
}
