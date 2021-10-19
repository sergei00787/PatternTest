package composite_pattern;

public class Radio implements Component{
    private String song;
    private String name;
    private int volume;

    public Radio(String name, String song, int volume) {
        this.song = song;
        this.volume = volume;
        this.name = name;
    }

    @Override
    public void doJob() {
        System.out.println("Radio "+ this.name + " play song " + this.song + "volume=" + this.volume);
    }

    @Override
    public void makeNet() {
        System.out.println("Radio search WIFI");
    }
}
