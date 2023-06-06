import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class CodeViewLinkTest {
    @Test
    public void testReturnToMainPageLink() {
        Selenide.open("https://www.wikipedia.org/");
        Selenide.$("#searchInput").val("Java").pressEnter();
        Selenide.$("#ca-view a").shouldHave(Condition.attribute("href", "/wiki/Java"));
    }
}
