class StoreOneA extends StoreToRent {
    private static final double DISCOUNT_RATE = 0.1;
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String parentInfo = super.toString();
        StringBuilder details = new StringBuilder();
        details.append(parentInfo);
        if (isLoanRequired()) {
            details.append("LOAN DETAILS:\n");
            details.append("Loan Amount: ").append(getLoanAmount()).append("\n");
            details.append("Loan Payment Term: ").append(getLoanPaymentTerm()).append("\n");
            details.append("Interest Rate: ").append(getINTEREST_RATE()).append("\n");
            details.append("Special Customer: ").append(specialCustomer).append("\n");
            details.append("Monthly Loan Payment: ").append(monthlyPayment).append("\n");
        }
        return details.toString();
    }

    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }
}
