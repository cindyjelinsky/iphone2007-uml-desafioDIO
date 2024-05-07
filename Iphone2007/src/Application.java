import entities.Iphone;

public class Application {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("Browser App:\n");
        iphone.openNewtab();
        iphone.refreshPage();
        iphone.viewPage();

        System.out.println("\nMusic Player:\n");
        iphone.play();
        iphone.pause();
        iphone.selectTrack();

        System.out.println("\nPhone:\n");
        iphone.call();
        iphone.answerCall();
        iphone.voicemail();
    }
}