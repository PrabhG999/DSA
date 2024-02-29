package Spring_Concepts.IOC.Whatsap;

import Spring_Concepts.IOC.MessageService;

public class WhatsAppClient{
    
    private MessageService messageService;
    
    public WhatsAppClient(MessageService messageService){
        this.messageService= messageService;
    }
    
    public void sendWhatsAppMessage(){
        String message = messageService.getMessage();
        //logic
    }
}
