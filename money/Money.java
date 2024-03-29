package money;

public class Money implements Expression{
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

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    @Override
    public Expression times(int multiplier){
        return new Money(this.amount * multiplier,currency);
    }

    @Override
    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }

    public String currency() {
        return currency;
    };

    @Override
    public String toString(){
        return amount + " " + currency;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}
