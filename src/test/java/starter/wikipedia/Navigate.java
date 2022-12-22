package starter.wikipedia;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    /**
     * An action that opens the browser on the Wikipedia home page
     */
    public static Performable toTheHomePage() {
        return Open.url("https://nunzioweb.com/iframes-example.htm");
    }

    public static Performable toTheAlertPage() {
        return Open.url("https://demo.automationtesting.in/Alerts.html");
    }
}
