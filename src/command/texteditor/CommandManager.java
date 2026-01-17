package command.texteditor;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandManager {

    private final Deque<UndoableCommand> history = new ArrayDeque<>();

    public void executeCommand(UndoableCommand command) {
        command.execute();
        history.push(command);
    }

    public void undoLast() {
        if (history.isEmpty()) {
            System.out.println("CommandManager: Nichts zum Undo vorhanden");
            return;
        }
        UndoableCommand last = history.pop();
        last.undo();
    }
}
