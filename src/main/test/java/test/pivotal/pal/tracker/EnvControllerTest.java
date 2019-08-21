package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.EnvController;
import org.junit.Test;


import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;



public class EnvControllerTest {
    @Test
    public void getenv(){

        EnvController controller = new EnvController(
                "1111","11G","20","123.45.67"
        );


        Map<String, String> env = controller.getEnv();

        assertThat(env.get("PORT")).isEqualTo("1111");
        assertThat(env.get("MEMORY_LIMIT")).isEqualTo("11G");
        assertThat(env.get("CF_INSTANCE_INDEX")).isEqualTo("20");
        assertThat(env.get("CF_INSTANCE_ADDR")).isEqualTo("123.45.67");
    }



}
