package money;

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression expression);

    Expression times(int multiplier);
}
