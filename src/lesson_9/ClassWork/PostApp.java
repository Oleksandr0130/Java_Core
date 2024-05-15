package lesson_9.ClassWork;

import java.util.Scanner;

public class PostApp {
    public static void main(String[] args) {
        MailDeliveryService[] services = {
                new DHL(),
                new Email(),
                new Pigeon()
        };
        MailDeliveryService service = selectService(services);
        if (service != null){
            sendMail(service);
        }
    }

    public static MailDeliveryService selectService(MailDeliveryService[] services){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ отправки");
        for (int i = 0; i < services.length; i++) {
            System.out.println(i + " " + services[i].getServiceName());
        }
        int choice = scanner.nextInt();
        if (choice < 0 || choice >= services.length){
            return null;
        }else {
            return services[choice];
        }
    }
    public static void sendMail(MailDeliveryService service){
        System.out.println("Подготовили письмо");
        System.out.println("Отправляем........");
        service.deliveryMail();
        System.out.println("Отправлено!");
    }
}
