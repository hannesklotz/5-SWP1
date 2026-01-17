package command.texteditor;

public class RemoveTextCommand implements UndoableCommand {

    private final TextEditor editor;
    private final int count;
    private String removedText = "";

    public RemoveTextCommand(TextEditor editor, int count) {
        this.editor = editor;
        this.count = count;
    }

    @Override
    public void execute() {
        String current = editor.getText();
        int start = Math.max(0, current.length() - count);
        removedText = current.substring(start);   // merkt sich entfernten Teil
        editor.removeLast(count);
    }

    @Override
    public void undo() {
        editor.addText(removedText);
    }
}
