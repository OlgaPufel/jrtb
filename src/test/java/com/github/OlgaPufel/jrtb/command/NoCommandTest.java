package com.github.OlgaPufel.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.OlgaPufel.jrtb.command.CommandName.NO;
import static com.github.OlgaPufel.jrtb.command.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }
}
