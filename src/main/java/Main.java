import components.MyFrame;
import config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dominik C.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        new MyFrame();
    }
}
