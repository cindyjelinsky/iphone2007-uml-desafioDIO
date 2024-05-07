package entities;

import interfaces.Browser;
import interfaces.MusicPlayer;
import interfaces.Phone;

public class Iphone implements Browser, MusicPlayer, Phone {

    public Iphone() {
    }

    @Override
    public void viewPage() {
        System.out.println("OPENING PAGE");
    }

    @Override
    public void refreshPage() {
        System.out.println("REFRESHING PAGE");
    }

    @Override
    public void openNewtab() {
        System.out.println("OPENING NEW TAB");
    }

    @Override
    public void play() {
        System.out.println("PLAYING TRACK");
    }

    @Override
    public void pause() {
        System.out.println("TRACK PAUSED");
    }

    @Override
    public void selectTrack() {
        System.out.println("SELECT TRACK");
    }

    @Override
    public void call() {
        System.out.println("CALLING CONTACT");
    }

    @Override
    public void answerCall() {
        System.out.println("ANSWERING CALL");
    }

    @Override
    public void voicemail() {
        System.out.println("LISTENING TO VOICEMAIL");
    }
}
