package Context;

import Strategy.StrategyB;
import Strategy.StrategyIF;

public class ContextSub2 extends Context {
    public ContextSub2() {
        super(new StrategyB());
    }
}
