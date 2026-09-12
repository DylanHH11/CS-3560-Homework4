public class EmployeeDriver {
    private SalariedEmployee employeeOne = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
    private HourlyEmployee employeeTwo = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
    private HourlyEmployee employeeThree = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
    private CommissionEmployee employeeFour = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
    private SalariedEmployee employeeFive = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
    private BaseEmployee employeeSix = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
    private CommissionEmployee employeeSeven = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

    private void getEmployeeInfo(Employee employee) {
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("SSN: " + employee.getSocialSecurityNumber());
    }

    private void getSalariedEmployeeInfo(SalariedEmployee employee) {
        getEmployeeInfo(employee);
        System.out.println("Weekly Salary: $" + employee.getWeeklySalary());
    }

    private void getHourlyEmployeeInfo(HourlyEmployee employee) {
        getEmployeeInfo(employee);
        System.out.println("Wage: $" + employee.getWage());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
    }

    private void getCommissionEmployeeInfo(CommissionEmployee employee) {
        getEmployeeInfo(employee);
        System.out.println("Commission Rate: " + employee.getCommissionRate() + "%");
        System.out.println("Gross Sales: $" + employee.getGrossSales());
    }

    private void getBaseEmployeeInfo(BaseEmployee employee) {
        getEmployeeInfo(employee);
        System.out.println("Base Salary: $" + employee.getBaseSalary());
    }

    public void getAllEmployeeInfo()
    {
        getSalariedEmployeeInfo(employeeOne);
        System.out.println();
        getHourlyEmployeeInfo(employeeTwo);
        System.out.println();
        getHourlyEmployeeInfo(employeeThree);
        System.out.println();
        getCommissionEmployeeInfo(employeeFour);
        System.out.println();
        getSalariedEmployeeInfo(employeeFive);
        System.out.println();
        getBaseEmployeeInfo(employeeSix);
        System.out.println();
        getCommissionEmployeeInfo(employeeSeven);
        System.out.println();
    }

    public static void main(String[] args)
    {
        EmployeeDriver employees = new EmployeeDriver();
        employees.getAllEmployeeInfo();
    }

    
}
