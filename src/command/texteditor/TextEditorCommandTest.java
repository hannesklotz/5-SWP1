package command.texteditor;

public class TextEditorCommandTest {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        manager.executeCommand(new AddTextCommand(editor, "Hallo"));
        System.out.println("Text: " + editor.getText());

        manager.executeCommand(new AddTextCommand(editor, " Welt"));
        System.out.println("Text: " + editor.getText());

        manager.executeCommand(new RemoveTextCommand(editor, 3)); // entfernt "elt"
        System.out.println("Text: " + editor.getText());

        manager.undoLast(); // Undo Remove
        System.out.println("Undo 1: " + editor.getText());

        manager.undoLast(); // Undo Add " Welt"
        System.out.println("Undo 2: " + editor.getText());

        manager.undoLast(); // Undo Add "Hallo"
        System.out.println("Undo 3: " + editor.getText());

        manager.undoLast(); // nichts mehr
    }
}
