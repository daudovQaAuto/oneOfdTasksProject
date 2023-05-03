import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.HeaderMenu;
import pages.PopularPage;

public class BaseTest {
    protected HeaderMenu headerMenu = new HeaderMenu();
    protected PopularPage popularPage = new PopularPage();


    @BeforeAll
    public static void setUp(){
        Configuration.headless = true;
    }

    @BeforeEach
    public void openPage(){
        Selenide.open("https://shop.1-ofd.ru/");
    }
}
