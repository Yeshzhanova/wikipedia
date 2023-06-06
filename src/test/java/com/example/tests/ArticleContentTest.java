import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class ArticleContentTest {
    @Test
    public void testContentExists() {
        Selenide.open("https://www.wikipedia.org/");
        Selenide.$("#searchInput").val("Java").pressEnter();
        Selenide.$(".mw-parser-output").should(Condition.exist);
    }
}
