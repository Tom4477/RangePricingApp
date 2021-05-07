package rangepricingapplication.Supplier;

import java.util.ArrayList;
import java.util.Comparator;

public class SupplierReport {

    ArrayList<SupplierSummary> supplierSummaries;

    public SupplierReport() {

        supplierSummaries=new ArrayList<>();
    }

    public void addSupplierSummary(SupplierSummary supplierSummary)
    {
        supplierSummaries.add(supplierSummary);
    }

    public SupplierSummary[] genTop10SupBySalesVolume()
    {
        SupplierSummary[] suppliers=new SupplierSummary[10];
        supplierSummaries.sort(new Comparator<SupplierSummary>() {
            @Override
            public int compare(SupplierSummary supplierSummary, SupplierSummary t1) {
                return t1.getSalesvolume()-supplierSummary.getSalesvolume();
            }
        });

        for(int i=0;i<10;i++)
            suppliers[i]=supplierSummaries.get(i);

        return  suppliers;
    }
}
