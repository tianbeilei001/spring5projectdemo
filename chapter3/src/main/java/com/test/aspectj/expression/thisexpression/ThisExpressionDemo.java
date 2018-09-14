package com.test.aspectj.expression.thisexpression;

import com.test.aspectj.expression.FoodFactory;
import com.test.aspectj.expression.target.HuaweiPhoneFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/9/10
 * @Description
 */
public class ThisExpressionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-chapter3-aspectjthisexpression.xml");
        FoodFactory foodFactory = (FoodFactory) context.getBean("foodFactory");
        foodFactory.make();
        System.out.println("-----分割线-----");
        Listener listener = (Listener) foodFactory;
        listener.listen();
    }
}
