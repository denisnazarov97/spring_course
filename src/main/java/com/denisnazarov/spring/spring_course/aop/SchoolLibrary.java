package com.denisnazarov.spring.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

//    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
