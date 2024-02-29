package Spring_Concepts.IOC.SMS;

import Spring_Concepts.IOC.MessageService;

public class smsService implements MessageService {
    //create the method which was requested in interface MessageService
    public String getMessage(){
        return "Email Message";
    }
}
