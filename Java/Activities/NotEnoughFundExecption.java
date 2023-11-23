package Activities;

public class NotEnoughFundExecption extends RuntimeException {

    public NotEnoughFundExecption(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }

}
