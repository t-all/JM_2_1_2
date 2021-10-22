import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() + " " + bean);
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage() + " " + bean2);

        boolean comparison = bean == bean2;
        System.out.println(comparison);

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage() + " " + catBean);
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getMessage() + " " + catBean2);

        boolean comparison2 = catBean == catBean2;
        System.out.println(comparison2);
    }
}