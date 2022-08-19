public class SavingsAccount {
    private String accHolderName;
    private long accHolderNumber;
    private String accOpeningDate;
    private String accStatus;
    private double avlBalance;
    private double totalBalance;
    private boolean internetBankingEnabled;
    private boolean mobileBankingEnabled;
    private float interestrate;
    private String modeOfOpr;

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public void setAccHolderNumber(long accHolderNumber) {
        this.accHolderNumber = accHolderNumber;
    }

    public void setAccOpeningDate(String accOpeningDate) {
        this.accOpeningDate = accOpeningDate;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }
    public void setAvlBalance(double avlBalance) {
        this.avlBalance = avlBalance;
    }
    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
        this.avlBalance=this.totalBalance;
    }
    public void creditBalance(int credit)
    {
        this.avlBalance=this.avlBalance+credit;
    }
    public void debitBalance(int debit)
    {
        this.avlBalance=this.avlBalance-debit;
    }
    public void setInternetBankingEnabled(boolean internetBankingEnabled) {
        this.internetBankingEnabled = internetBankingEnabled;
    }
    public void setMobileBankingEnabled(boolean mobileBankingEnabled) {
        this.mobileBankingEnabled = mobileBankingEnabled;
    }
    public void setInterestrate(float interestrate) {
        this.interestrate = interestrate;
    }
    public void setModeOfOpr(String modeOfOpr) {
        this.modeOfOpr = modeOfOpr;
    }
    //getter methods


    public String getAccHolderName() {
        return accHolderName;
    }
    public long getAccHolderNumber() {
        return accHolderNumber;
    }
    public String getAccOpeningDate() {
        return accOpeningDate;
    }
    public String getAccStatus() {
        return accStatus;
    }
    public double getAvlBalance() {
        return avlBalance;
    }
    public double getTotalBalance() {
        return totalBalance;
    }
    public float getInterestrate() {
        return interestrate;
    }
    public boolean getInternetBankingEnabled() {
        return internetBankingEnabled;
    }
    public boolean getMobileBankingEnabled() {
        return mobileBankingEnabled;
    }
    public String getModeOfOpr() {
        return modeOfOpr;
    }
}
