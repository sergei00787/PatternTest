package bridge_pattern;

public interface IDevice {
    void setVolume(int volume);
    int getVolume();
    void setPower(String power);
    String getPower();
    String getStatus();
}
