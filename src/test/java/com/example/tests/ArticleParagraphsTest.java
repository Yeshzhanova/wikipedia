import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArticleParagraphsTest {
    @Test
    public void testParagraphsExist() {
        Selenide.open("https://www.wikipedia.org/");
        Selenide.$("#searchInput").val("Java").pressEnter();
        ElementsCollection paragraphs = Selenide.$(".mw-parser-output").$$("p");
        assertTrue(paragraphs.size() > 0);
    }
}
