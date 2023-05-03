package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenu {


    private final SelenideElement katalogLink = $x("(//a[@href='/collection/all'])[1]");
    private final SelenideElement akciyaLink = $x("(//a[@href='/collection/popular'])[2]");
    private final SelenideElement oplataLink = $x("(//a[@href='/page/payment'])[2]");
    private final SelenideElement dostavkaLink = $x("(//a[@href='/page/delivery'])[2]");
    private final SelenideElement samovivozLink = $x("(//a[@href='/page/samovivoz'])[2]");
    private final SelenideElement novostiLink = $x("(//a[@href='/blogs/blog'])[2]");
    private final SelenideElement kontaktiLink = $x("(//a[@href='/page/contacts'])[2]");
    private final SelenideElement nashiKlientyLink = $x("(//a[@href='/page/nashi-klienty'])[2]");




    public HeaderMenu checkPresenceOfKatalogButton(String message) {
        katalogLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu clickAkciyaButton() {
        katalogLink.shouldBe(visible).click();
        return this;
    }

    public HeaderMenu checkPresenceOfAkciyaButton(String message) {
        akciyaLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu checkPresenceOfOplataButton(String message) {
        oplataLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu checkPresenceOfDostavkaButton(String message) {
        dostavkaLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu checkPresenceOfSamovivozButton(String message) {
        samovivozLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu checkPresenceOfNovostiButton(String message) {
        novostiLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu checkPresenceOfKontaktiButton(String message) {
        kontaktiLink.shouldHave(text(message));
        return this;
    }

    public HeaderMenu checkPresenceOfNashiKlientiButton(String message) {
        nashiKlientyLink.shouldHave(text(message));
        return this;
    }

}

