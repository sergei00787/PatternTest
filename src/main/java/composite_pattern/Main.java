package composite_pattern;

public class Main {
    public static void main(String[] args) {
        BoxComponent box = new BoxComponent();

        Radio radio1 = new Radio("radio1", "beleave me", 20);
        SoundBar soundBar1 = new SoundBar("soundBar1", "never let you go", 30);

        box.addComponent(radio1);
        box.addComponent(soundBar1);

        box.doJob();
        box.makeNet();

    }
}
