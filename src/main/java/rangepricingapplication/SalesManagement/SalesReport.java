package rangepricingapplication.SalesManagement;

import java.util.ArrayList;

public class SalesReport {

    ArrayList<SalesSummary> salesSummaries;

    public void addSalesSummary(SalesSummary ss)
    {
        salesSummaries.add(ss);
    }
   //generate 10 best performing sales people here
    public SalesSummary[] genTop10SalesBySV()
    {
        SalesSummary[] salesSums=new SalesSummary[10];


       return salesSums;
    }

}
