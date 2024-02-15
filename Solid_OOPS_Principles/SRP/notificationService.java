package Solid_OOPS_Principles.SRP;

public class notificationService {
    void notification(String medium){

    }
    void transactional(String medium){

    }
    void sendOTP(String medium){
        if(medium.equals("mobile")){
            //can have options like whatsapp,imessage etc use twillio api for writing logic , modification cannot happen only extension can happen.
        }
        if(medium.equals("email")){
            //write logic with mailSenderApi
        }
    }
}
