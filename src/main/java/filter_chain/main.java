package filter_chain;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:10
 **/


public class main {
    public static void main(String[] args) {
        CalcChain chain = new CalcChain();
        chain.add(new AddCalc(100));
        chain.add(new AddCalc(10));
        chain.add(new SubCalc(20));
        chain.add(new SubCalc(200));

        System.out.println(chain.next().process(0.0, chain));

    }
}
