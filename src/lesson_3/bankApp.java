package lesson_3;

import java.util.ArrayList;

public class bankApp {
    public static void main(String[] args) {
//        bankAccount a1= new bankAccount("DE12345862",new Person("Jack","Vorobey"));
//        bankAccount a2= new bankAccount("DE123458689",new Person("John","Lennon"));
//        bankAccount a3= new bankAccount("DE1234586786",new Person("Jack","Nickolson"));
//        bankAccount a4= new bankAccount("DE12345862768",new Person("Anna","Smith"));
////        bankAccount[] bankAccounts = {a1, a2, a3, a4};
        Bank bank = new Bank("Imperial");

//        System.out.println(bank);
//        System.out.println("=========================");
//        bankAccount LennonAcc = bank.getAccountByUsersLastName("Lennon");
//        System.out.println(LennonAcc);
//        System.out.println("=========================");
//
//        bank.depositAccountUserLastName("Lennon", 1000);
//        System.out.println(bank);
//        System.out.println("=========================");
//        bank.withDrawAccountUserLastName("Lennon", 200);
//        System.out.println(bank);

        System.out.println("============03.05==============");

        bank.addNewAccount(new bankAccount("DE12345862456443",new Person("Oleg","Ivanov")));
        bank.depositAccountUserLastName("Ivanov", 1000);
        bank.addNewAccount(new bankAccount("DE1234586245644365756",new Person("Nick","Brown")));
        System.out.println(bank);
        System.out.println("===============Новые счета===============");
        bank.addNewAccount(new bankAccount("DE_1234586245644",new Person("Igor","Igorevich")));
        System.out.println(bank);
        System.out.println("=======перевод=======");
        bank.transfer("Ivanov","Brown",500);
        bank.transfer("Smith","Brown",200);
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
