package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImp implements NotificationAlertObserver{

    String emailId;

    //constructor Injection

    StockObservable observable;

    public EmailAlertObserverImp(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock hurry up");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to:" +emailId);
    }
}
