package rangepricingapplication.SalesManagement;

import java.util.ArrayList;
import java.util.Comparator;

public class SalesReport {

    ArrayList<SalesSummary> salesSummaries;

    public SalesReport() {
         salesSummaries =new ArrayList<>();
    }

    public void addSalesSummary(SalesSummary ss)
    {
        salesSummaries.add(ss);
    }
   //generate 10 best sales people here
    public SalesSummary[] genTop10SalesBySV()
    {
        SalesSummary[] salesSums=new SalesSummary[10];

        salesSummaries.sort(new Comparator<SalesSummary>() {
            @Override
            public int compare(SalesSummary salesSummary, SalesSummary t1) {
                return t1.getSalesvolume()-salesSummary.getSalesvolume();
            }
        });

        for(int i=0;i<10;i++)
        {
            salesSums[i]=salesSummaries.get(i);
        }
       return salesSums;
    }

    //generate 10 best sales people here by price performance
    public SalesSummary[] genTop10SalesByPP()
    {
        SalesSummary[] salesSums=new SalesSummary[10];

        salesSummaries.sort(new Comparator<SalesSummary>() {
            @Override
            public int compare(SalesSummary salesSummary, SalesSummary t1) {
                return t1.getPricePerformance()-salesSummary.getPricePerformance();
            }
        });

        for(int i=0;i<10;i++)
        {
            salesSums[i]=salesSummaries.get(i);
        }
        return salesSums;
    }
}
