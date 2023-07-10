package Context;

import Strategy.StrategyA;
import Strategy.StrategyIF;

public class ContextSub1 extends Context{
    public ContextSub1() {
        super(new StrategyA());
    }
}
