package com.designMode.CommandMode;

public class StereOnWithCDCommand implements Command{

    Stereo stereo;
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

}
