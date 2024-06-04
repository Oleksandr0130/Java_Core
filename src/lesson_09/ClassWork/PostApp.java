package lesson_09.ClassWork;

import java.util.Scanner;

public class PostApp {
    public static void main(String[] args) {
        MailDeliveryService[] services = {
                new DHL(),
                new Email(),
                new Pigeon()
        };

        boolean isContinue = true;
        while(isContinue) {
            MailDeliveryService service = selectService(services);
            if (service != null) {
                sendMail(service);
            }
        isContinue = isContinue();
        }
    }
    public static boolean isContinue(){
        System.out.println("0 - exit");
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt() == 0? false : true);
    }

    public static MailDeliveryService selectService(MailDeliveryService[] services){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ отправки");
        for (int i = 0; i < services.length; i++) {
            System.out.println((i + 1) + " " + services[i].getServiceName());
        }
        int choice = scanner.nextInt();
        if (choice < 0 || choice >= services.length){
            return null;
        }else {
            return services[choice - 1];
        }
    }
    public static void sendMail(MailDeliveryService service){
        System.out.println("Подготовили письмо");
        System.out.println("Отправляем........");
        service.deliveryMail();
        System.out.println("Отправлено!");
    }
}
