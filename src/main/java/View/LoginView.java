package View;

import java.util.Scanner;

/**
 * @author te9uila
 * @since 2023/7/18
 */
public class LoginView {
    public Scanner sc = new Scanner(System.in);
    public void loginView(){
        System.out.println("---------------------登录----------------------");
        System.out.println("用户名：");
        String username = sc.nextLine();
        System.out.println("密码：");
        String password = sc.nextLine();
        //--------调方法。。。。
    }
}
