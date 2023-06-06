

package com.example.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class WikipediaSearchTest {
    @Test
    public void testSearch() {
        Selenide.open("https://www.wikipedia.org/");
        Selenide.$("#searchInput").val("Java").pressEnter();
        Selenide.$("#firstHeading").shouldHave(Condition.text("Java"));
    }
}
