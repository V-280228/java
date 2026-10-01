abstract class notification{
    String msg;
    abstract void sendNotification();
}
class EmailNotification extends notification{
    EmailNotification(String msg){
        this.msg = msg;
    }
    void sendNotification(){
        System.out.println("Email Notification: " + msg);
    }
}
class SMSNotification extends notification{
    SMSNotification(String msg){
        this.msg = msg;
    }
    void sendNotification(){
        System.out.println("SMS Notification: " + msg);
    }
}
public class notify{
    public static void main(String[] args){
        EmailNotification e = new EmailNotification("Congratulations! You have passed the exam");
        e.sendNotification();
        SMSNotification s = new SMSNotification("Hello Vaishnavi");
        s.sendNotification();
    }
}
