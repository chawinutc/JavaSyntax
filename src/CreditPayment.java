public class CreditPayment implements Payment{
    @Override
    public void pay(double money){
        IO.println(String.format("Paid " + money + " Baht using Credit Card."));
        IO.readln(String.format("get point for Cash back"));
    }
}
