package lesson_09.ClassWork;

public class DHL implements MailDeliveryService{
    @Override
    public void deliveryMail() {
        System.out.println("Покупаем конверт и марку");
        System.out.println("Упаковываем письмо");
        System.out.println("На почту");
    }

    @Override
    public String getServiceName() {
        return "DHL";
    }
}
