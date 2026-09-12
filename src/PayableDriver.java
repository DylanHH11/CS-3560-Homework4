import java.util.ArrayList;

public class PayableDriver {
    private ArrayList<Payable> payablesList = new ArrayList<Payable>(4);
    private Freelancer freelancerOne = new Freelancer("Jerry", "Jacobs",20,40);
    private Freelancer freelancerTwo= new Freelancer("John", "Jefferies",15,45);
    private VendorInvoice vendorInvoiceOne = new VendorInvoice("vendorOne","1234",200);
    private VendorInvoice vendorInvoiceTwo = new VendorInvoice("vendorTwo","5678",300);

    public PayableDriver()
    {
        payablesList.add(freelancerOne);
        payablesList.add(freelancerTwo);
        payablesList.add(vendorInvoiceOne);
        payablesList.add(vendorInvoiceTwo);
    }

    public void getPayablesInformation() {
        double totalPayout = 0;
        for (Payable i : payablesList)
        {
            i.print();
            System.out.println();
            totalPayout += i.calculatePayment();
        }
        System.out.printf("Total Payout: $%.2f%n", totalPayout);
    }

    public static void main(String[] args)
    {
        PayableDriver payables = new PayableDriver();
        payables.getPayablesInformation();
    }
}
