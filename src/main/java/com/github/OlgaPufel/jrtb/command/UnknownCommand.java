package com.github.OlgaPufel.jrtb.command;

import com.github.OlgaPufel.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command {
    private final SendBotMessageService sendBotMessageService;
    public static final String UNKNOWN_MESSAGE = "Не понимаю Вас, напишите /help";

    public UnknownCommand (SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),UNKNOWN_MESSAGE);
    }
}
