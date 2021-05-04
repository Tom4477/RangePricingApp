package rangepricingapplication.SalesManagement;

public class SalesSummary {

    SalesManProfile salesMan;
    int salesvalume;
    int pricePerformance;

    public SalesSummary(SalesManProfile smp) {
        pricePerformance=smp.getPricePerformance();
        salesvalume=smp.getSalesVolume();
       salesMan = smp;
    }

    public int getSalesvalume() {
        return salesvalume;
    }

    public void setSalesvalume(int salesvalume) {
        this.salesvalume = salesvalume;
    }

    public int getPricePerformance() {
        return pricePerformance;
    }

    public void setPricePerformance(int pricePerformance) {
        this.pricePerformance = pricePerformance;
    }
}
