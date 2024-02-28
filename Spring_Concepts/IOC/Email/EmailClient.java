package Spring_Concepts.IOC.Email;

import Spring_Concepts.IOC.MessageService;

public class EmailClient{

    private MessageService emailMessageService;

    public EmailClient(MessageService emailMessageService){
        this.emailMessageService = emailMessageService;
    }

    public void sendEmail(){
        String email = emailMessageService.getMessage();
    }

}
