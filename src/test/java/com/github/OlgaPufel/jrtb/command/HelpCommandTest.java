package com.github.OlgaPufel.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.OlgaPufel.jrtb.command.CommandName.HELP;
import static com.github.OlgaPufel.jrtb.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }
}
