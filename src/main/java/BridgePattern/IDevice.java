package BridgePattern;

public interface IDevice {
    void setVolume(int volume);
    int getVolume();
    void setPower(String power);
    String getPower();
    String getStatus();
}
