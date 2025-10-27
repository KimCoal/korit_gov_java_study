package _19_Interface;

public class TvRemoteController{
    private PowerButton powerButton;
    private ChannelUp channelUp;
    private ChannelDown channelDown;
    private VolumeDownButton volumeDownButton;
    private VolumneUpButton volumneUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelUp channelUp, ChannelDown channelDown, VolumeDownButton volumeDownButton, VolumneUpButton volumneUpButton) {
        this.powerButton = powerButton;
        this.channelUp = channelUp;
        this.channelDown = channelDown;
        this.volumeDownButton = volumeDownButton;
        this.volumneUpButton = volumneUpButton;
    }

    public void onPressedPowerButton() {
        System.out.print("Tv의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        System.out.print("Tv의 ");
        channelDown.onPressed();
    }

    public void onDownChannelDownButton() {
        System.out.print("Tv의 ");
        channelDown.onDown();
    }

    public void onPressedChannelUpButton() {
        System.out.print("Tv의 ");
        channelUp.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("Tv의 ");
        channelUp.onUp();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("Tv의 ");
        volumneUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.print("Tv의 ");
        volumneUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        System.out.print("Tv의 ");
        volumeDownButton.onDown();
    }


}
