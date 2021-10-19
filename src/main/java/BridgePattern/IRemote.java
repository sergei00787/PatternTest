package BridgePattern;

public interface IRemote {
    public void setDevice(IDevice device);

    public void upVolume();

    public void downVolume();

    public void togglePowerButton();
}
