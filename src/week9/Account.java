package week9;

import java.util.*;

public class Account {
    private String login;
    String password;
    String passwordConfirm;

    public Account() {
    }

    public Account(String login) {
        this.login = login;
    }

    public Account(String password, String passwordConfirm) {
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }


    void checkLogin() throws WrongLoginException {
        if (login == null || login.length() < 5 || login.length() > 20) {
            System.out.println("Введен некорректный формат логина");
            throw new WrongLoginException();
        }
    }

    void checkPassword() throws WrongPasswordException {
        if (password == null || password.length() < 8 || password.length() > 20 || !password.equals(passwordConfirm)) {
            System.out.println("Введен некорректный формат пароля");
            throw new WrongPasswordException();
        }
    }

    void checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException {

        HashMap<String, String> LoginAndPassword = new HashMap<>();

        LoginAndPassword.put("qwerty", "123456789");
        LoginAndPassword.put("123456789", "147258369");
        LoginAndPassword.put("qweasdzxc", "784951623");

        if (LoginAndPassword.get(login) == null || !LoginAndPassword.get(login).equals(password)) {
            throw new WrongLoginOrPasswordException("Указан неверный логин или пароль");
        }
    }

    public static void main(String args[]) {

        //ввод логина
        System.out.print("Введите логин: ");
        Scanner inputLogin = new Scanner(System.in);
        String login = inputLogin.nextLine();

        Account accountLogin = new Account(login);
        try {
            accountLogin.checkLogin();
        } catch (WrongLoginException e) {
            System.out.println("Исключение:" + e);
        }

        //ввод пароля и повтор пароля
        System.out.print("Введите пароль: ");
        Scanner inputPassword = new Scanner(System.in);
        String password = inputPassword.nextLine();

        System.out.print("Повторите пароль: ");
        Scanner inputPasswordConfirm = new Scanner(System.in);
        String passwordConfirm = inputPasswordConfirm.nextLine();

        Account accountPassword = new Account(password, passwordConfirm);
        try {
            accountPassword.checkPassword();
        } catch (WrongPasswordException e) {
            System.out.println("Исключение:" + e);
        }

        //проверка на существующий аккаунт
        Account checkAccount = new Account();
        try {
            checkAccount.checkLoginAndPassword(login, password);
            System.out.println("Вы успешно вошли в аккаунт!");
        } catch (WrongLoginOrPasswordException e) {
            System.out.println("Исключение:" + e);
        }

    }
}


