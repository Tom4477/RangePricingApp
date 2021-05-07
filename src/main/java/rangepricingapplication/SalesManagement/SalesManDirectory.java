package rangepricingapplication.SalesManagement;


import java.util.ArrayList;

public class SalesManDirectory {
    ArrayList<SalesManProfile> salesList;

    public SalesManDirectory(){
        salesList=new ArrayList<>();
    }

    public SalesReport generatPerformanceReport(){
        SalesReport salereport = new SalesReport();

        for(SalesManProfile p: salesList){

            SalesSummary ps = new SalesSummary(p);
            salereport.addSalesSummary(ps);
        }
        return salereport;
    }
}
