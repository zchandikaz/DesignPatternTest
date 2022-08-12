package filter_chain;

import java.util.*;

/**
 * @author : chandika
 * @since : 2022-08-11(Thu) 23:03
 **/


public class CalcChain {
    Queue<ICalc> chain = new ArrayDeque<>();

    public void add(ICalc calc){
        chain.add(calc);
    }

    public ICalc next(){
        if(chain.isEmpty())
            return new ICalc() {
                @Override
                public Double process(Double number, CalcChain chain) {
                    return number;
                }
            };
        return chain.poll();
    }
}
