package com.github.OlgaPufel.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.OlgaPufel.jrtb.command.CommandName.START;
import static com.github.OlgaPufel.jrtb.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level testing for StartCommand")
public class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }
}
