import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class ChangeLanguageTest {
    @Test
    public void testChangeLanguage() {
        Selenide.open("https://www.wikipedia.org/");
        Selenide.$(".central-featured-lang").shouldHave(Condition.text("Русский"));
    }
}
