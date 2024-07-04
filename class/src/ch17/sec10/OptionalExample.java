package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        double avg;
//방법 1
        OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
        if (optional.isPresent()) {
            System.out.println("방법1_평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1_평균: 0.0");
        }
//방법2
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균: " + avg);

//방법3 : 값이 있을 때 출력하도록 하는 것인데 값이 없기 때문에 출력하는 내용이 없음.

        list.stream().mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a));
    }
}