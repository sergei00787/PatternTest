package BridgePattern;

public class Remote implements IRemote{

    private IDevice device;

    public Remote() {
    }

    public Remote(IDevice device) {
        this.device = device;
    }

    @Override
    public void setDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void upVolume(){
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void downVolume(){
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void togglePowerButton(){
        if (device.getPower().equals("off")){
            device.setPower("on");
        } else {
            device.setPower("off");
        }
    }
}
