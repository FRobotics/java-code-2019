package frc.robot.state;

public enum TeleopState implements StateBase {
    DEFAULT(), START(1000);

    private long time;

    private TeleopState() {
        this(-1);
    }

    private TeleopState(long time) {
        this.time = time;
    }

    @Override
    public long getTime() {
        return time;
    }

}