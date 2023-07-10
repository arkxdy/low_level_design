package Observer;

import Observable.StockObservable;

public class MobileAlert implements NotificationAlert{
    String emailID;
    StockObservable observable;
    public MobileAlert(String emailID,StockObservable observable){
        this.emailID = emailID;
        this.observable = observable;
    }
    public void update(){
        SendMail(emailID,"Alert Mobile");
    }
    private void SendMail(String emailID,String msg){
        System.out.println(emailID+" Msg - "+msg);
    }
}
