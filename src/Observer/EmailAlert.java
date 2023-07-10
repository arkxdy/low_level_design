package Observer;

import Observable.StockObservable;

public class EmailAlert implements NotificationAlert{
    String emailID;
    StockObservable observable;
    public EmailAlert(String emailID,StockObservable observable){
        this.emailID = emailID;
        this.observable = observable;
    }
    public void update(){
        SendMail(emailID,"Alert Email");
    }
    private void SendMail(String emailID,String msg){
        System.out.println(emailID+" Msg - "+msg);
    }
}
