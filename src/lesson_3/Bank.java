package lesson_3;

public class Bank {
    private int capacity = 6;
    private String title;
    private bankAccount[] bankAccounts = new bankAccount[capacity];
    private int size;
    private TransactionsArray transactionsArray = new TransactionsArray();

    public Bank(String title, bankAccount[] array) {
        this.title = title;
//        this.array = array;
        size = 0;
        addNewAccount(array);
    }


    private String accountsToString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += bankAccounts[i] + "\n";
        }
        return res;
    }

    public String getTitle() {
        return title;
    }

    public bankAccount getAccountByUsersLastName(String lastName){
        for (int i = 0; i < size; i++) {
            if (bankAccounts[i].getUser().getLastName().equals(lastName)) {
                return bankAccounts[i];
            }
        }
        return null;
    }

    public void depositAccountUserLastName(String lastName, double amount){
        bankAccount account = getAccountByUsersLastName(lastName);
        if (account != null){
            account.deposit(amount);
        }
    }public void withDrawAccountUserLastName(String lastName, double amount){
        bankAccount account = getAccountByUsersLastName(lastName);
        if (account != null){
            account.withDraw(amount);
        }
    }

    public boolean transfer(String lastNameFrom, String lastNameTo, double amount){

        bankAccount accountFrom =  getAccountByUsersLastName(lastNameFrom);
        bankAccount accountTo = getAccountByUsersLastName(lastNameTo);
        if (accountFrom == null || accountTo == null){
            return false;
        }
        if (accountFrom.withDraw(amount)){
            accountTo.deposit(amount);
            transactionsArray.addTransaction(new Transaction(accountFrom,accountTo,amount));
            return true;
        }
            return false;
    }

    public TransactionsArray getTransactionsArray() {
        return transactionsArray;
    }

    private void addNewAccount(bankAccount[] array) {
        for (int i = 0; i < array.length; i++){
            addNewAccount(array[i]);
        }
    }

    public void addNewAccount(bankAccount account){
        if (size >= bankAccounts.length){
            enlarge();
        }
        bankAccounts[size++] = account;
    }

    private void enlarge() {
        bankAccount[] temp = new bankAccount[bankAccounts.length * 2];
        for (int i = 0; i < bankAccounts.length; i++) {
            temp[i] = bankAccounts[i];
        }
        bankAccounts = temp;
    }

    @Override
    public String toString() {
        return  "Bank: " + title + "Всего счетов: " + size + "\n Счета:\n"
        + accountsToString();

    }
}
