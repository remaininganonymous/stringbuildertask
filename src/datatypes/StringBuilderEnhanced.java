package datatypes;

public class StringBuilderEnhanced {
    private StringBuilder stringBuilder;

    public StringBuilderEnhanced() {
        this.stringBuilder = new StringBuilder();
    }

    public StringBuilderEnhanced(String str) {
        this.stringBuilder = new StringBuilder(str);
    }

    public StringBuilderEnhanced(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder undo(StringBuilder snapshot) {
        stringBuilder = snapshot;
        return stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
