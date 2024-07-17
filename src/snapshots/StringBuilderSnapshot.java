package snapshots;

public class StringBuilderSnapshot {
    private StringBuilder state;

    public StringBuilderSnapshot (StringBuilder state) {
        this.state = state;
    }
    public StringBuilder getState() {
        return state;
    }
}
