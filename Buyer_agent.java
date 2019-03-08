package bookstore;


public class Buyer_agent extends Person{
    Books books ;

    public Buyer_agent() {
        super();
        books = new Books();
    }

    public  Buyer_agent(Person person)
    {
        super();
        Account_name = person.getAccount_name();
        Account_passwd = person.getAccount_passwd();
        Account_category = person.isAccount_category();
        books = new Books();
    }
    public boolean isAccount_category() {
        return Account_category;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Books getBookMessages() {
        Books BooksList = new Books();//for循环读取书籍数据

        return BooksList; //返回数据库中的所有书
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
    public boolean purchaseBooks(Books TargetBooks,int amount)
    {
        if(findDataBase(TargetBooks.Books_id))//返回数据库中对应书的对象TargetBooks
        {
            if(TargetBooks.Inventory - amount < 0)
            {
                System.out.println("库存不够!");
                return false;
            }
            else
                //数据库里对应书减去amount值
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
