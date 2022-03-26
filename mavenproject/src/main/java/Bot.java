import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.math.BigInteger;
import java.util.Arrays;

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
        String receivedMessage = update.getMessage().getText();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        String response = "";
        User user = update.getMessage().getFrom();
        if (receivedMessage.startsWith("/start")) {
            if (user.getFirstName() != null) {
                response += "Привет, " + user.getFirstName();
            }
            if (user.getLastName() != null) {
                response += user.getLastName();
            }
            if (user.getUserName() != null) {
                response += "\nТвой логин: " + user.getUserName();
            }
        } else if (receivedMessage.startsWith("/count")) {
            String[] currValue = receivedMessage.replaceAll("\\s+", " ").split(" ");
            System.out.println(Arrays.toString(currValue));
            BigInteger val1 = new BigInteger(currValue[1]);
            BigInteger val2 = new BigInteger(currValue[2]);
            response += "Результат: " + val1.add(val2);
        }

        sendMessage.setText(response);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        // mavenproject серый?
        // File -> Project Structure -> Modules -> Плюсик

        // -> Import Module -> выбираем папку с mavenproject (целиком)
        // Import existing... (вторая кнопка в окне) -> Maven -> OK
        // Wait ~30secs

        // Telegram -> BotFather -> /newbot : Awesome Telegram Bot, blablabot.
        // /start -> Привет, {firstName} {lastName}.(след.строка)Твой логин: {username}
        // /count 10 23 -> Результат: {a + b}. Числа любой длины

        // Advantage: если имя||фамилия||юзернейм == null, скипаем.
        // Advantage: если имя&&фамилия&&юзернейм == null, скипаем.
        // Advantage: если юзернейм == null - не выводим последнюю строку (Твой логин...)
    }
}
