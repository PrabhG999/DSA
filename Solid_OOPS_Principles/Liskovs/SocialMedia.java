package Solid_OOPS_Principles.Liskovs;

public abstract class SocialMedia {
    //abstract class consisting of abstract methods
    //all support Instagram,facebook
    public abstract void postPhotos();
    public abstract void postVideos();
    public abstract void postStories();
    public abstract void sendMessage();
    public abstract void sendGroupMessage();
    public abstract void makeVideoChat();
    public abstract void makeGroupVideoChat();
}
