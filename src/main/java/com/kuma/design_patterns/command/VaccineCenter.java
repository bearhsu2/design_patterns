package com.kuma.design_patterns.command;

import java.util.ArrayList;
import java.util.List;

public class VaccineCenter {


    private final List<Command> commands = new ArrayList<>();


    public VaccineCenter(Command... commands) {
        for (Command command : commands) {
            this.commands.add(command);
        }
    }

    public void serve(Patient patient) {


        for (Command command : commands) {
            command.execute(patient);
        }


    }

}
