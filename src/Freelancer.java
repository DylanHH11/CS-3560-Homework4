public class Freelancer implements Payable{
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return (hoursWorked <= 40) ? (hourlyRate * hoursWorked) : (hourlyRate * 40) + (1.5 * hourlyRate * (hoursWorked - 40));
    }

    @Override
    public String getPayeeName() {
        return this.firstName + " " + this.lastName;
    }

    public void print() {
        System.out.println("Freelancer: " + getPayeeName());
        System.out.printf("Payment: $%.2f%n", calculatePayment());
    }

}
