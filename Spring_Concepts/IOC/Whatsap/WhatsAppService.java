package Spring_Concepts.IOC.Whatsap;

import Spring_Concepts.IOC.MessageService;

public class WhatsAppService implements MessageService {      //create a servive to define method

    public String getMessage(){
        return "Whatsapp message";
    }
}

