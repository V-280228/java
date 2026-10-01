abstract class payment{
    double amount;
    abstract void makepayment();
}
class CreditCardPayment extends payment{
    CreditCardPayment(double amount){
        this.amount = amount;
    }
    void makepayment(){
        System.out.println(amount +" Payment is done by Credit Card");
    }
}
class DebitCardPayment extends payment{
    DebitCardPayment(double amount){
        this.amount = amount;
    }
    void makepayment(){
        System.out.println(amount + " Payment is done by Debit Card");
    }
}
class UPIPayment extends payment{
    UPIPayment(double amount){
        this.amount = amount;
    }
    void makepayment(){
        System.out.println(amount + " Payment is done by UPI");
    }
}
public class paying{
    public static void main(String[] args){
        CreditCardPayment c = new CreditCardPayment(100.0);
        DebitCardPayment d = new DebitCardPayment(200.0);
        UPIPayment u = new UPIPayment(300.0);

        c.makepayment();
        d.makepayment();
        u.makepayment();
    }
}