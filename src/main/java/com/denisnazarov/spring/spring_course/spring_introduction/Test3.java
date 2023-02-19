package com.denisnazarov.spring.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        pet.say();
//        Pet pet = new Cat();
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
