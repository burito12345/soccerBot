import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by Ermin Kameric on 20.10.2017.
 */
public class SoccerBot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {

        }
    }

    public String getBotUsername() {
        return "htld_soccer_bot";
    }

    public String getBotToken() {
        return "429411678:AAFSGcIsfofYVi1wz8UkwEbGorJbme5L-0s";
    }
}
