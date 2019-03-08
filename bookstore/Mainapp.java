package bookstore;


import java.util.Scanner;

 lic class Mainapp {
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
            loginName = scanner.next();
            passwd = scanner.next();
            category = scanner.nextBoolean();
            input = scanner.nextInt();
            switch (input) {
                case 1: //登录
                    if (category) {
                        manager = new Manager_agent(loginName,passwd,category);
                        if(!manager.loginAccount())
                            manager.delete();
                    }
                    else {
                        buyer = new Buyer_agent(loginName,passwd,category);
                        if(!buyer.loginAccount())
                            buyer.delete();
                    }
                    break;
                case 2: //注册
                    if (category)
                    {
                        manager = new Manager_agent(loginName,passwd,category);
                        if(manager.registerAccount())
                            System.out.println("Register is success!");
                        else
                            System.out.println("Register is fault!");
                        manager.delete();
                    }
                    else
                    {
                        buyer = new Buyer_agent(loginName,passwd,category);
                        if(buyer.registerAccount())
                            System.out.println("Register is success!");
                        else
                            System.out.println("Register is fault!");
                        buyer.delete();
                    }
                    break;
                case 3: //删除用户
                    person = new Person(loginName,passwd);
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
                if (manager != null) { //管理员界面
                    input = scanner.nextInt();
                    switch (input) {
                        case 1: //获得所有图书信息
                            manager.getBookMessages();
                            break;
                        case 2: //查找书籍
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
                            manager.soldOut(Books_id);
                            break;
                        case 5: //退出登录
                            manager.delete();
                            break;
                    }
                }
                if (buyer != null) { //客户界面
                    input = scanner.nextInt();
                    switch (input) {
                        case 1: //获得所有图书信息
                            buyer.getBookMessages();
                            break;
                        case 2: //查找书籍
                            String key = "hehe";
                            buyer.findBooks(key);
                            break;
                        case 3: //购买书籍
                            Books_id = 123;
                            int amount = 10;
                            buyer.purchaseBooks(Books_id,amount);
                            break;
                        case 4: //退出登录
                            buyer.delete();
                            break;
                    }
                }

            }

        }

    }
}

