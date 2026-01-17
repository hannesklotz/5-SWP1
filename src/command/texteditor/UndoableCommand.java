package command.texteditor;

public interface UndoableCommand {
    void execute();
    void undo();
}
