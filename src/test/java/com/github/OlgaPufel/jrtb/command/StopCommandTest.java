package com.github.OlgaPufel.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.OlgaPufel.jrtb.command.CommandName.STOP;
import static com.github.OlgaPufel.jrtb.command.StopCommand.STOP_MESSAGE;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }
}
