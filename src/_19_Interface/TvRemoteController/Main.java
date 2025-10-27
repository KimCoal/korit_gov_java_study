package _19_Interface.TvRemoteController;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(),
            new ChannelUp(),
            new ChannelDown(),
            new VolumeDownButton(),
            new VolumneUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelUpButton();
        PowerButton powerButton = new PowerButton();
        powerButton.onPressed();
    }
}
