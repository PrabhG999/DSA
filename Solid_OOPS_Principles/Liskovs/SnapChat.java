package Solid_OOPS_Principles.Liskovs;

public class SnapChat extends SocialMedia{

    @Override
    public void postPhotos() {
        //not supported by snapchat
    }

    @Override
    public void postVideos() {
        //not supported by snapchat
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
