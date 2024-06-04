package lesson_05.HWClassWork;

public class bankApp {
    public static void main(String[] args) {

        Bank bank = new Bank("Imperial");
        System.out.println(bank.getTitle());

        System.out.println("============03.05==============");

        bank.addNewAccount(new bankAccount("DE12345862456443",new Person("Oleg","Ivanov")));
        bank.depositAccountUserLastName("Ivanov", 1000);
        bank.withDrawAccountUserLastName("Ivanov", 200);
        bank.addNewAccount(new bankAccount("DE1234586245644365756",new Person("Nick","Brown")));
        System.out.println(bank);
        System.out.println("===============Новые счета===============");
        bank.addNewAccount(new bankAccount("DE_1234586245644",new Person("Igor","Igorevich")));
        System.out.println(bank);
        System.out.println("=======перевод=======");
        bank.transfer("Ivanov","Brown",500);
        bank.transfer("Smith","Brown",200);
        bank.transfer("Brown","Igorevich",300);
        System.out.println(bank);
        System.out.println("=======Transactions=======");
        System.out.println(bank.getTransactionsArray());





//        a1.deposit(1000);
//        a2.deposit(500);
//        for (int i = 0; i < bankAccounts.length; i++) {
//            System.out.println(bankAccounts[i]);
//        }
//        System.out.println("----------------------------------");
//        a2.withDraw(1000);
//        System.out.println(a2);
//        a2.withDraw(300);
//        System.out.println(a2);
//
//        Person person = new Person("qwer", "qwerty");
//        System.out.println(person);
//        person.setFirstName("Ivan");
//        person.setLastName("Ivanov");
//        System.out.println(person);
//        System.out.println(person.getFirstName());
    }
}
