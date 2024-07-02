import command.Command;
import command.ExitCommand;
import ui.Menu;
import ui.MenuItem;


public abstract class App {
//    boolean run = true;
//    int studentNum = 0;
//    int[] scores = null;
//    Scanner scanner = new Scanner(System.in);

    Menu menu;


    public App() {

    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("종료", new ExitCommand()));

    }
    public void createMenu(Menu menu) {
    }

    public void run() {
    init();
        while(true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }


}