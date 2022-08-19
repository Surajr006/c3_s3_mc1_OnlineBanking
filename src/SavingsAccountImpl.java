public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount();

        savingsAccount.setAccHolderName("Gopal");
        savingsAccount.setAccHolderNumber(3959742L);
        savingsAccount.setAccOpeningDate("22/5/2022");
        savingsAccount.setAccStatus("Active");
        savingsAccount.setAvlBalance(50000);
        savingsAccount.setTotalBalance(50000);
        savingsAccount.setInternetBankingEnabled(true);
        savingsAccount.setMobileBankingEnabled(false);
        savingsAccount.setInterestrate(7.5f);
        savingsAccount.setModeOfOpr("Savings");
        //Displaying account details
        System.out.println(savingsAccount.getAccHolderName());
        System.out.println(savingsAccount.getAccHolderNumber());
        System.out.println(savingsAccount.getAccOpeningDate());
        System.out.println(savingsAccount.getAccStatus());
        System.out.println(savingsAccount.getAvlBalance());
        System.out.println(savingsAccount.getTotalBalance());
        System.out.println(savingsAccount.getInternetBankingEnabled());
        System.out.println(savingsAccount.getMobileBankingEnabled());
        System.out.println(savingsAccount.getInterestrate());
        System.out.println(savingsAccount.getModeOfOpr());
        //Credit and debit transaction
        savingsAccount.creditBalance(20000);
        System.out.println("Available Balance = " + savingsAccount.getAvlBalance());
        savingsAccount.debitBalance(10000);
        System.out.println("Available Balance = " + savingsAccount.getAvlBalance());
    }
}
