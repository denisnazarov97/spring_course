package com.denisnazarov.spring.spring_course.spring_introduction;

//@Component
public class Dog implements Pet {
//private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
