package filter_chain;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:03
 **/


public interface ICalc {
    Double process(Double number, CalcChain chain);
}
