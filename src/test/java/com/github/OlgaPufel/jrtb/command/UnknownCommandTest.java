package com.github.OlgaPufel.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.OlgaPufel.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return "/ggyuftdtd";
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }
}
