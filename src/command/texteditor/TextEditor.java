package command.texteditor;

public class TextEditor {

    private final StringBuilder text = new StringBuilder();

    public void addText(String t) {
        text.append(t);
    }

    public void removeLast(int n) {
        if (n <= 0) return;
        int start = Math.max(0, text.length() - n);
        text.delete(start, text.length());
    }

    public String getText() {
        return text.toString();
    }
}
