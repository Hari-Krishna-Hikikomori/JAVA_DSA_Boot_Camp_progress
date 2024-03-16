package OOPS.Interface.OverrideIssue;

public class Sonyplayer implements MediaPlayer{
    @Override
    public void Start() {
        System.out.println("Play Music");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Music");
    }
}
