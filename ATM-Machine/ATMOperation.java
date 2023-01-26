class ATMOperation{
    private double balance;
    private double depositeAmount;
    private double withdrawAmount;

    //getter methods
    public double getBalance(){
        return balance;
    }
    public double getDepositeAmount(){
        return depositeAmount;
    }
    public double getWithdrawAmount(){
        return withdrawAmount;
    }

    //setter method
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setDepositeAmount(double depositeAmount){
        this.depositeAmount = depositeAmount;
    }
    public void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }
}