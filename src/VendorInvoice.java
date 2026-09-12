public class VendorInvoice implements Payable{
    private String vendorName;
    private String invoiceNumber;
    private double dueAmount;

    public VendorInvoice(String vendorName,String invoiceNumber, double dueAmount)
    {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        this.dueAmount = dueAmount;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    @Override
    public double calculatePayment() {
        return dueAmount;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    public void print() {
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice #" + invoiceNumber);
        System.out.printf("Payment Due: $%.2f%n", calculatePayment());
    }
}
