package Context;

import Strategy.StrategyIF;

public class Context {
    StrategyIF strategyIF;
    //this is known as constructor injection
    Context(StrategyIF strategy){
        this.strategyIF = strategy;
    }
    public void Test1(){
        //common for all
        System.out.println("Common method");
    }
    public void Diff(){
        strategyIF.Fix();
    }
}
