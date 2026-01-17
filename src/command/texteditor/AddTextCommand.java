package command.texteditor;

public class AddTextCommand implements UndoableCommand {

    private final TextEditor editor;
    private final String toAdd;
    private int addedLength;

    public AddTextCommand(TextEditor editor, String toAdd) {
        this.editor = editor;
        this.toAdd = toAdd;
    }

    @Override
    public void execute() {
        editor.addText(toAdd);
        addedLength = toAdd.length();
    }

    @Override
    public void undo() {
        editor.removeLast(addedLength);
    }
}
