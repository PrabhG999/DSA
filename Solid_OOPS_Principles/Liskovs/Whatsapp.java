package Solid_OOPS_Principles.Liskovs;

public class Whatsapp extends SocialMedia{

    @Override
    public void postPhotos() {
        //not supported by whatsapp
    }

    @Override
    public void postVideos() {
        //not supported by whatsapp
    }

    @Override
    public void postStories() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void sendGroupMessage() {

    }

    @Override
    public void makeVideoChat() {

    }

    @Override
    public void makeGroupVideoChat() {

    }
}
