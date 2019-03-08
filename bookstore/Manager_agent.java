package bookstore;

import java.util.ArrayList;
import java.util.List;

 
public class Manager_agent extends Person{
    List<Books> BooksList  = new ArrayList<Books>();
    boolean Account_category;//是用户\管理员

    public Manager_agent() {
        super();
    }

    public Manager_agent(String loginName, String passwd, boolean account_category) {
        super(loginName, passwd);
        Account_category = account_category;
    }

    public boolean getBookMessages() {
        //for循环读取书籍数据
        if(BooksList.size()>0)
            return true;
        else
        {
            System.out.println("目录没有书");
            return false;
        }
    }
    public boolean findBooks(String Key) {
        int pos = findDataBase(Key);
        if(pos>=0)
        {
            //将数据库数据传入BooksList
            return true;
        }
        else
            return false;
    }

    public List<Books> getBooksList() {
        return BooksList;
    }

    public void setBooksList(List<Books> booksList) {
        BooksList = booksList;
    }
    public boolean isAccount_category() {
        return Account_category;
    }

    public void setAccount_category(boolean account_category) {
        Account_category = account_category;
    }

    public boolean addBooks(Books NewBooks) //添加
    {
        //将NewBooks添加进数据库
        return true;
    }

    public boolean soldOut(int Books_id) //下架
    {
        int pos = findDataBase(Books_id);
        if(pos>=0)
        {
            //删除该书
            //OldBooks.Inventory = 0; //修改数据库
            return true;
        }
        else
        {
            System.out.println("找不到该书");
            return false;
        }
    }
    public void post()
    {

    }
    public int findDataBase(int BooksId)
    {
        return 1;
    }
    public int findDataBase(String Key)
    {
        return 1;
    }
}
