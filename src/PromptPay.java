public class PromptPay implements Payment{
    @Override
    public void pay(double money){
        IO.readln(String.format("use Mobile Application"));
        IO.println(String.format("Paid " + money + " Baht using PromptPay."));

    }
}
