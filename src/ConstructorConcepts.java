public class ConstructorConcepts {
    private String accNumber;
    private double accBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //Constructor declaration
    public ConstructorConcepts() {
        //below this keyword will set the default values when the empty constructor is called.
        this("12345",100.00, "default name",
                "default address", "default number");
        System.out.println("Empty Constructor called!");

    }

    //Constructor overloading
    public ConstructorConcepts(String accNumber, double accBalance, String customerName, String customerEmail,
                                String customerPhone) {
        System.out.println("Constructor with parameters called!");
        this.accBalance = accBalance;
        //the other way of setting the value is using the setter method
        //example: setAccBalance(accBalance);

        this.accNumber = accNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

    }

    public ConstructorConcepts(String customerName, String customerEmail,
                               String customerPhone) {
        this("9999",1000.00,customerName,customerEmail,customerPhone);

    }

    public void deposit(double depositAmount){
        this.accBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is: " + accBalance);

    }

    public void withdrawal(double withdrawAmount){
        if(accBalance - withdrawAmount <0){
            System.out.println("Only " + accBalance + " available. Withdrawal not processed!");
        } else {
            accBalance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaning balance = " + accBalance);
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
