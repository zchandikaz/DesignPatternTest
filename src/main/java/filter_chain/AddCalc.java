package filter_chain;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:03
 **/


public class AddCalc implements ICalc{
    private double amount;

    public AddCalc(double amount) {
        this.amount = amount;
    }

    @Override
    public Double process(Double number, CalcChain chain) {
        return chain.next().process(number+amount,chain);
    }
}
