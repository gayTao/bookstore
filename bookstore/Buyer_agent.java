package bookstore;

import java.util.ArrayList;
import java.util.List;

 
public class Buyer_agent extends Person{
    List<Books> BooksList  = new ArrayList<Books>();
    boolean Account_category;//是用户\管理员

    public void setAccount_category(boolean account_category) {
        Account_category = account_category;
    }

    public Buyer_agent() {
        super();
    }

    public Buyer_agent(String loginName, String passwd, boolean account_category) {
        super(loginName, passwd);
        Account_category = account_category;
    }

    public boolean isAccount_category() {
        return Account_category;
    }

    public List<Books> getBooksList() {
        return BooksList;
    }

    public void setBooksList(List<Books> booksList) {
        BooksList = booksList;
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
    public boolean purchaseBooks(int Books_id,int amount)
    {
        int pos = findDataBase(Books_id);
        if(pos>=0)//返回数据库中对应书的对象TargetBooks
        {
            if(BooksList.get(pos).Inventory - amount < 0)
            {
                System.out.println("库存不够!");
                return false;
            }
            else
                //数据库里对应书减去amount值
                return true;
        }
        else
        {
            System.out.println("无该书目");
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
