import command.*;

import java.util.Scanner;
public class App {
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;
    Scanner scanner = new Scanner(System.in);

    Menu menu;
    Command[] commands;


    public App() {

        menu = new Menu();
        commands = new Command[] {
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoreCommand(),
                new AnalizeCommand(),
                new ExitCommand()
        };
    }

    public void executeCommand(int selectNo) {
        Command command = commands[selectNo-1];
        command.execute();
    }

//    private void analize() {
//        int max = 0;
//        int sum = 0;
//        double avg = 0;
//        for(int
//            i=0;
//            i
//                    <scores.length;
//            i++) {
//            max = (max<scores[
//                    i])? scores[
//                    i] : max;
//            sum += scores[
//                    i];
//        }
//        avg = (double) sum / studentNum
//        ;
//        System.out.println("최고 점수: " + max);
//        System.out.println("평균 점수: " + avg);
//    }
//    public void getStudentNum() {
//        System.out.print("학생수> ");
//        studentNum = Integer.parseInt
//                (scanner.nextLine());
//        scores = new int
//                [studentNum];
//    }
//    public void getScores() {
//        for(int i=0; i<scores.length; i++) {
//            System.out.print("scores[" + i + "]> ");
//            scores[i] = Integer.parseInt(scanner.nextLine());
//        }
//    }
//    public void printScore() {
//        for(int i=0; i<scores.length; i++) {
//            System.out.println("scores[" + i + "]: " + scores[i]);
//        }
//    }
//    public void exit() {
//        run = false;
//    }
//
    public void run() {
        while(run) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand
                    (selectNo);
        }
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}