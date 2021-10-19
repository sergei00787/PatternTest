package composite_pattern;

public class SoundBar implements Component{
    private String song;
    private String name;
    private int volume;

    public SoundBar(String name, String song, int volume) {
        this.song = song;
        this.volume = volume;
        this.name = name;
    }

    @Override
    public void doJob() {
        System.out.println("SoundBar "+ this.name + " play song " + this.song + ", volume=" + this.volume);
    }

    @Override
    public void makeNet() {
        System.out.println("Sound Bar search BT");
    }
}
