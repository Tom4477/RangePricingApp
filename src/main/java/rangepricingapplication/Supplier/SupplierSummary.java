package rangepricingapplication.Supplier;


public class SupplierSummary {

    Supplier supplier;
    int salesvolume;

    public int getSalesvolume() {
        return salesvolume;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public SupplierSummary(Supplier supplier) {
        this.supplier = supplier;
    }
}
