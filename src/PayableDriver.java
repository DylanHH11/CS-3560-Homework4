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
        for (Payable i : payablesList)
        {
            i.print();
        }
    }

    public static void main()
    {
        PayableDriver payables = new PayableDriver();
        payables.getPayablesInformation();
    }
}
