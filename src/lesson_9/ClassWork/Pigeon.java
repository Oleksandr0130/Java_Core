package lesson_9.ClassWork;

public class Pigeon implements MailDeliveryService{
    @Override
    public void deliveryMail() {
        System.out.println("Голубь?! ");
    }

    @Override
    public String getServiceName() {
        return "Голубь";
    }
}
