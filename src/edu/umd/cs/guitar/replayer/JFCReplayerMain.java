package edu.umd.cs.guitar.replayer;

import edu.umd.cs.guitar.model.GIDGenerator;
import edu.umd.cs.guitar.model.JFCDefaultIDGenerator;

public class JFCReplayerMain extends ReplayerMain {

    public JFCReplayerMain(GReplayerConfiguration config) {
        super(config);
    }

    protected GReplayerMonitor createMonitor() {
        return new JFCReplayerMonitor(config);
    }

    protected GIDGenerator getIdGenerator() {
        return JFCDefaultIDGenerator.getInstance();
    }
}
