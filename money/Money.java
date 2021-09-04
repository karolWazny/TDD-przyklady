package money;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount){
        return new Franc(amount, "CHF");
    }

    public Money times(int multiplier){
        return new Money(this.amount * multiplier,currency);
    };

    public String currency() {
        return currency;
    };

    @Override
    public String toString(){
        return amount + " " + currency;
    }
}
