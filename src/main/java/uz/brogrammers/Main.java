package uz.brogrammers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Kvadrat kvadrat = context.getBean("kvadrat", Kvadrat.class);
        System.out.println("Kvadrat = " + kvadrat.yuza());
        context.close();

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Rectangel rectangel = context1.getBean("rectangel", Rectangel.class);
        System.out.println("Rectangel = " + rectangel.yuza());
        context1.close();

        ClassPathXmlApplicationContext context2=new ClassPathXmlApplicationContext("applicationContext.xml");
        Doira doira=context2.getBean("doira", Doira.class);
        System.out.println("Doira = "+doira.yuza());
        context2.close();

    }

}
