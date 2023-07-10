package Observable;

import Observer.NotificationAlert;

public interface StockObservable
{
    public void add(NotificationAlert obs);
    public void remove(NotificationAlert obs);
    public void notifyObs();
    public void setData(int new_count);
    public int getData();
}
