package com.luoll.command.batch;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by luolingling on 2017/9/11.
 */
public class CommandQueue {

    private AbstractCommand command;

    private List<AbstractCommand> commands = new LinkedList<>();

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public int execute(int value) {
        int i = command.execute(value);
        commands.add(command.copy());
        return i;
    }

    public int undo() {
        int i = 0;
        for (int j = commands.size() - 1; j >= 0; j--) {
            AbstractCommand command = commands.get(j);
            if (command.status == 1) {
                i = command.undo();
                break;
            }
        }
        return i;
    }

    public int redo() {
        int i = 0;
        for (AbstractCommand command : commands) {
            if (command.status == 2) {
                i = command.redo();
                break;
            }
        }
        return i;
    }
}
