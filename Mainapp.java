package bookstore;


import java.util.Scanner;

/**
 * Created by WJF on 2016/12/1.
 */
public class Mainapp {
    public static void main(String a[]) {
        int input;
        String loginName;
        String passwd;
        boolean category;
        Person person = null;
        Manager_agent manager = null;
        Buyer_agent buyer = null;
        Scanner scanner = new Scanner(System.in);
        Books books;
        int Books_id;
        String Books_name;
        String Books_author;
        double Price;
        int Sales;
        int Inventory;

        while (true) {
            person = new Person(scanner.next(), scanner.next());
            input = scanner.nextInt();
            switch (input) {
                case 1: //登录
                    if (person.loginAccount()) {
                        if (person.isAccount_category()) {
                            manager = new Manager_agent();
                            manager.setAccount_name(person.getAccount_name());
                            manager.setAccount_passwd(person.getAccount_passwd());
                            manager.setAccount_category(person.isAccount_category());
                        } else {
                            buyer = new Buyer_agent();
                            buyer.setAccount_name(person.getAccount_name());
                            buyer.setAccount_passwd(person.getAccount_passwd());
                            buyer.setAccount_category(person.isAccount_category());
                        }
                    } else {
                        System.out.println("login is fault");
                    }
                    break;
                case 2: //注册
                    if (person.registerAccount()) {
                        System.out.println("Register is success!");
                    } else
                        System.out.println("Register is fault!");
                    break;
                case 3: //删除用户
                    if (person.isExistAccount()) {
                        if (person.delete()) {
                            System.out.println("delete is success!");
                        } else
                            System.out.println("deleter is fault!");
                    } else {
                        System.out.println("The account isn't exist!");
                    }
                    break;
            }
            while (manager != null || buyer != null)//跳转到登陆后页面
            {
                if (manager != null) {
                    input = scanner.nextInt();
                    switch (input) {
                        case 1: //获得所有图书信息
                            manager.getBookMessages();
                            break;
                        case 2:
                            String key = "hehe";
                            manager.findBooks(key);
                            break;
                        case 3: //添加书籍
                            Books_id = 123;
                            Books_name = "hehe";
                            Books_author = "wjf";
                            Price = 20;
                            Inventory = 100;
                            books = new Books(Books_id,Books_name,Books_author,Price,Inventory);
                            manager.addBooks(books);
                            break;
                        case 4: //删除书籍
                            Books_id = 123;
                            Books_name = "hehe";
                            Books_author = "wjf";
                            Price = 20;
                            Inventory = 100;
                            books = new Books(Books_id,Books_name,Books_author,Price,Inventory);
                            manager.soldOut(books);
                            break;
                    }
                }
                if (buyer != null) {
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            buyer.delete();
                            break;
                    }
                }

            }

        }

    }
}

