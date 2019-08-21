package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.WelcomeController;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeControllerTest {


    @Test
    public void  getwelcome(){
        WelcomeController welcomecontrollertest = new WelcomeController ("Hello Welcome:");

        assertThat(welcomecontrollertest.sayHello()).isEqualTo("Hello Welcome:");

    }



}
