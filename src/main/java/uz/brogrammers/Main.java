package uz.brogrammers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Kvadrat kvadrat = context.getBean("kvadrat", Kvadrat.class);
        System.out.println(kvadrat.yuza());
        context.close();

    }
}
