package Spring_Concepts.IOC.Email;

import Spring_Concepts.IOC.MessageService;

public class EmailService implements MessageService {

    public String getMessage() {
        return "Return Email";
    }
}
