package Observable;

import Observer.NotificationAlert;

import java.util.*;

public class IphoneObservable implements StockObservable
{
    public List<NotificationAlert> observerList = new ArrayList<NotificationAlert>();
    public int stockCount = 0;
    public void add(NotificationAlert obs){
        observerList.add(obs);
    }
    public void remove(NotificationAlert obs){
        observerList.remove(obs);
    }
    public void notifyObs(){
        for (NotificationAlert obs:observerList) {
            obs.update();
        }
    }
    public void setData(int new_count){
        if(stockCount==0){
            notifyObs();
        }
        this.stockCount = stockCount+new_count;
    }
    public int getData(){
        return this.stockCount;
    }

}
