package bookstore;

/**
 * Created by WJF on 2016/12/1.
 */
public class Manager_agent extends Person{
    Books books;

    public Manager_agent() {
        super();
        books = new Books();
    }
    public  Manager_agent(Person person)
    {
        super();
        Account_name = person.getAccount_name();
        Account_passwd = person.getAccount_passwd();
        Account_category = person.isAccount_category();
        books = new Books();
    }
    public Books getBookMessages() {
        Books BooksList = new Books();//for循环读取书籍数据

        return BooksList; //返回数据库中的所有书
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Books findBooks(String Key) {
        Books TargetBooks = null;
        if(findDataBase(Key))
        {
            TargetBooks = new Books();
            //将数据库数据传入TargetBooks
        }
        return TargetBooks;
    }

    public boolean addBooks(Books NewBooks) //添加
    {
        //将NewBooks添加进数据库
        return true;
    }

    public boolean soldOut(Books OldBooks) //下架
    {
        if(findDataBase(OldBooks.getBooks_id()))
        {
            OldBooks.Inventory = 0; //修改数据库
            return true;
        }
        else
            return false;
    }
    public void post()
    {

    }
    public boolean findDataBase(int BooksId)
    {
        return true;
    }
    public boolean findDataBase(String Key)
    {
        return true;
    }
}