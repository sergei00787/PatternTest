package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv(20, "off");
        Radio radio = new Radio(30, "on");

        IRemote remoteTv = new Remote(tv);
        IRemote remoteRadio = new Remote(radio);

        remoteTv.togglePowerButton();
        System.out.println(tv.getStatus());
        remoteTv.upVolume();
        System.out.println(tv.getStatus());
        remoteTv.downVolume();
        System.out.println(tv.getStatus());
        remoteTv.togglePowerButton();
        System.out.println(tv.getStatus());

        remoteRadio.togglePowerButton();
        System.out.println(radio.getStatus());
        remoteRadio.upVolume();
        System.out.println(radio.getStatus());
        remoteRadio.downVolume();
        System.out.println(radio.getStatus());
        remoteRadio.togglePowerButton();
        System.out.println(radio.getStatus());
    }
}
