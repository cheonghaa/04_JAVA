package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();

        //Board 클래스의 인스턴스 4개 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        //요소의 개수 출력
        int size = list.size();
        System.out.println("총 객제 수 : " + size);
        System.out.println();

        //3번째 데이터 추출
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        //for문 사용해서 데이터 추출
        for(int i=0; i<list.size(); i++) {
            Board temp = list.get(i);
            System.out.println(i + "번째 :" + board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }
        System.out.println();

        //인덱스 요소 제거
        list.remove(2);
        list.remove(2);

        for(int i=0; i<list.size(); i++) {
            Board temp = list.get(i);
            System.out.println(i + "번째 :" + board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        }


    }
}
