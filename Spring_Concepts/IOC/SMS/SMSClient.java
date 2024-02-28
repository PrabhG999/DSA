package Spring_Concepts.IOC.SMS;

import Spring_Concepts.IOC.MessageService;

public class SMSClient {
    //extend the method created by MessageService

 private MessageService messageService;    //creating a dependnency

 public SMSClient(){      //constructor Injecttion
     this.messageService = new smsService();
 }
 public void sendMessage(){
     String message = messageService.getMessage();   //logic to send VIA SMS
    }

}
