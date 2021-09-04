package money;

public class Franc extends Money{

    public Franc(int amount, String currency){
        super(amount, currency);
    }
    public Money times(int multiplier){
        return Money.franc(this.amount * multiplier);
    }
    public String currency(){
        return "CHF";
    };
}
