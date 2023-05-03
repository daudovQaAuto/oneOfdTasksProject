package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopularPage {
    private final SelenideElement sortingMenu = $("select[class*='js']");
    private final SelenideElement sortByDescendingPopularityOption = $("option[value*='popular']");
    private final ElementsCollection quantatyOfEvolor5Stars = $$x("//a[contains(@href,'evotor-5')]/span[contains(@class,'rating')]");
    private final ElementsCollection elements = $$x("(//a[contains(@href,'evotor-5')])[3]");

    public PopularPage clickSortByDescendingPopularityOption() {
        sortingMenu.shouldBe(visible).click();
        sortByDescendingPopularityOption.click();
        return this;
    }

    public PopularPage checkRatingOfEvotor5() {
        quantatyOfEvolor5Stars.shouldHave(CollectionCondition.size(5));
       // elements.shouldHave(CollectionCondition.size(5));
        return this;
    }

    public PopularPage assertIsSelected() {
        Assertions.assertTrue(sortByDescendingPopularityOption.isSelected());
        return this;
    }
}
