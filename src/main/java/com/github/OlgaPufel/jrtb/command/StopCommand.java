package com.github.OlgaPufel.jrtb.command;

import com.github.OlgaPufel.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command {
    private final SendBotMessageService sendBotMessageService;
    public final static String STOP_MESSAGE = "Я деактивировал все ваши подписки";

    public StopCommand (SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),STOP_MESSAGE);
    }
}
