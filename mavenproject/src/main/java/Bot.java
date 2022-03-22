import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        System.out.println("Username inited");
        return "binoclabirthday_bot";
    }

    @Override
    public String getBotToken() {
        System.out.println("Token inited");
        return "5270190472:AAEqz8QgHE2jLH2clA-yFC16VGIEG8J0Q2o";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("Смотри! Что-то новое: "
                + update.getMessage().getText()
                + " "
                + update.getMessage().getFrom().getUserName());
        String chatId = String.valueOf(update.getMessage().getChatId());
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Спасибо, что написал "
                + update.getMessage().getFrom().getUserName() + ",\n Happy Birthday, Binocla!");
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
