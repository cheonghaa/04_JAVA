import command.*;
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

    public void init(int menuSize) {
        menu = new Menu(menuSize);
        createMenu(menu);
    }
    public void createMenu(Menu menu) {
    }

    public void run() {

        while(true) {
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
    }


}