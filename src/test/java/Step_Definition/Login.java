package Step_Definition;

import actions.LoginActions;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;

public class Login {
    private static LoginActions login = new LoginActions();
    @BeforeAll()
    public static void starup(){
        login.login();
    }
    @Given(": I have a valid {string} and {string} I should login")
    public void iHaveAValidAndIShouldLogin(String arg0, String arg1) {
       // login.google();
        System.out.println("logged");
    }

    @Given(": aliens invade earth")
    public void aliensInvadeEarth() {
        System.out.println("nay");
    }
}
