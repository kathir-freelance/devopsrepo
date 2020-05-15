package com.google.gmail;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(App.class);
        ctx.refresh();
        System.out.println(ctx.getBean("app"));
       }
}
