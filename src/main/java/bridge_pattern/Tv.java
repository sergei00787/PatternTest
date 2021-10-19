package bridge_pattern;

public class Tv implements IDevice{
    private int volume;
    private String power;

    public Tv() {
    }

    public Tv(int volume, String power) {
        this.volume = volume;
        this.power = power;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String getPower() {
        return this.power;
    }

    @Override
    public String getStatus() {
        return "Power:" + this.power + ", Volume:" + this.volume;
    }
}
