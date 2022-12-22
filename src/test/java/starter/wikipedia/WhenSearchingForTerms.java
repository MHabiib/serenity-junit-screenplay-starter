package starter.wikipedia;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.InputField;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @CastMember(name = "Wendy")
    Actor wendy;

//    @Test
    void searchBySingleKeyword() {
        wendy.attemptsTo(
                Navigate.toTheHomePage(),
            Switch.toFrame("frame"),
            Ensure.that(Text.of("//body")).contains("She had a 455 Rocket"),
            Ensure.that(Text.of("//body")).contains("She had a fasw35234 Rocket")
        );
    }

    @Test
    void searchBySingleKeywordDua() {
        wendy.attemptsTo(
            Navigate.toTheAlertPage(),
            Ensure.that(Text.of("//h1[normalize-space()='Automation Demo Site']")).contains("Automation Demo Site"),
            Click.on("//button[contains(text(),'click the button to display an')]"),
            Ensure.that(Text.of("//h1[normalize-space()='Automation Demo Site']")).contains("She had a fasw35234 Rocket")
        );
    }
}
