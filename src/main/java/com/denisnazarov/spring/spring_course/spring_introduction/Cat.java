
package com.denisnazarov.spring.spring_course.spring_introduction;

//@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean is created");
    }
    

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
    
}
