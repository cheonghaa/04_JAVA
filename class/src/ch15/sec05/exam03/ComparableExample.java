package ch15.sec05.exam03;

import java.util.ArrayList;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person("홍길동", 35));
        arrayList.add(new Person("감자바", 25));
        arrayList.add(new Person("박지원", 31));

        for(Person person : arrayList) {
            System.out.println(person.name + " : " + person.age);
        }
    }
}
