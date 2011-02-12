package edu.umd.cs.guitar.replayer;

import java.lang.Class;

public class JFCPluginInfo implements PluginInfo {
    public Class configType() {
        return JFCReplayerConfiguration.class;
    }

    public Class replayerType() {
        return JFCReplayerMain.class;
    }
}
