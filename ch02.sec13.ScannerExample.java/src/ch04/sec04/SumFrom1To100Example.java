package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
    int i=1;
    int sum =0;
    for (i=1; i<=100; i++) {
        sum = sum + i;
    }
        System.out.println("1~100 합 : "+sum);
    }


}
