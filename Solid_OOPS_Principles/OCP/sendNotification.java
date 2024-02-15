package Solid_OOPS_Principles.OCP;

public interface sendNotification {

    public void transactional(String medium);

    public void sendOTP(String medium); //this part of interface have multiple implentations

}
