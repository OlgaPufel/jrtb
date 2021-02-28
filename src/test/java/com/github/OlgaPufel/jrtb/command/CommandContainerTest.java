package com.github.OlgaPufel.jrtb.command;

import com.github.OlgaPufel.jrtb.service.SendBotMessageService;
import com.github.OlgaPufel.jrtb.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

@DisplayName("Unit-level testing for CommandContainer")
public class CommandContainerTest {
    private CommandContainer commandContainer;

    @BeforeEach
    public void init(){
        SendBotMessageService sendBotMessageService = Mockito.mock(SendBotMessageService.class);
        commandContainer = new CommandContainer(sendBotMessageService);
    }
    @Test
    public void shouldGetAllTheExistingCommands(){
        Arrays.stream(CommandName.values())
                .forEach(commandName -> {
                    Command command = commandContainer.retrieveCommand(commandName.getCommandName());
                    Assertions.assertNotEquals(UnknownCommand.class,command.getClass());
                });
    }

    @Test
    public void shouldReturnUnknownCommand(){
        String unknownCommand = "/jhkjj";
        Command command = commandContainer.retrieveCommand(unknownCommand);
        Assertions.assertEquals(UnknownCommand.class, command.getClass());
    }
}
