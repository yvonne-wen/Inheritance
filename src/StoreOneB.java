class StoreOneB extends StoreToRent {
    public StoreOneB(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        super(loanRequired, loanAmount, loanPaymentTerm);
    }

    public void createMenu() {
        System.out.println("Creating a special restaurant menu...");
    }
}