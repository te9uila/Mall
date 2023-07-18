package View;

import java.util.Scanner;

/**
 * @author te9uila
 * @since 2023/7/18
 */
public class MainView {
    public Scanner sc = new Scanner(System.in);
    public void mainView(){
        System.out.println("ヽ( ￣д￣;)ノ 嘿，来了嗷 0.o");
        System.out.println("1. 登录");
        System.out.println("2. 注册");
        System.out.println("3. 退出");
        System.out.println("----------------------------");
        while (true){
            int input = Integer.parseInt(sc.nextLine());
            switch (input){
                case 1:
                    new LoginView().loginView();
                    break;
                case 2:
                    new RegisterView().registerView();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("←_← 你输的介是个嘛");
            }
        }
    }
}
