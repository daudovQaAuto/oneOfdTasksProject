import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.support.ui.Wait;

import static constants.Constants.HeadersText.*;


public class HeadersTest extends BaseTest{


    @Test
    @DisplayName("Задание 1: Отображение верхнего меню «Каталог, Акция, Оплата и тд»")
    void testHeaderMenuDisplay() {
        headerMenu
                // Проверка отображения в шапке "Каталог"
                .checkPresenceOfKatalogButton(KATALOG)
                // Проверка отображения в шапке "Акция"
                .checkPresenceOfAkciyaButton(AKCIYA)
                // Проверка отображения в шапке "Оплата"
                .checkPresenceOfOplataButton(OPLATA)
                // Проверка отображения в шапке "Доставка"
                .checkPresenceOfDostavkaButton(DOSTAVKA)
                // Проверка отображения в шапке "Самовывоз"
                .checkPresenceOfSamovivozButton(SAMOVIVOZ)
                // Проверка отображения в шапке "Новости"
                .checkPresenceOfNovostiButton(NOVOSTI)
                // Проверка отображения в шапке "Контакты"
                .checkPresenceOfKontaktiButton(KONTAKTI)
                // Проверка отображения в шапке "Наши Клиенты"
                .checkPresenceOfNashiKlientiButton(NASHI_KLIENTI);
    }

    @Test
    @DisplayName("Задание 2: Перейти во вкладку «Акция» и отсортировать продукты «По популярности»")
    void testSortByDescendingPopularityOption() {
        headerMenu
                // Клик по кнопке "Акция" в шапке страницы
                .clickAkciyaButton();
        popularPage
                // Сортировка выпадающего списка "По популярности"
                .clickSortByDescendingPopularityOption()
                .assertIsSelected();
    }

    @Test
    @DisplayName("Задание 3: Перейти во вкладку «Акция» и проверить рейтинг продукта «Эвотор 5» (сколько звездочек)")
    void testCheckRatingOfEvotor5() {
        headerMenu
                // Клик по кнопке "Акция" в шапке страницы
                .clickAkciyaButton();
        popularPage
                // Сортировка выпадающего списка "По популярности"
                .checkRatingOfEvotor5();
    }
}
