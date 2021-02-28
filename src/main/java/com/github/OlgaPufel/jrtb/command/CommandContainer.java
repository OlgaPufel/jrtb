package com.github.OlgaPufel.jrtb.command;

import com.github.OlgaPufel.jrtb.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

import static com.github.OlgaPufel.jrtb.command.CommandName.*;

public class  CommandContainer {
    private final ImmutableMap<Object, Object> commandMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {
        commandMap = ImmutableMap.builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);

    }

    public Command retrieveCommand(String commandIdentifier){
        return (Command) commandMap.getOrDefault(commandIdentifier,unknownCommand);
    }
}
