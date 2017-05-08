package bookstore;

/**
 * Created by WJF on 2016/12/1.
 */
public class Person {
    String Account_name;
    String Account_passwd;



    public Person() {
    }

    public Person(String loginName, String passwd) {
        Account_name = loginName;
        Account_passwd = passwd;

    }

    public boolean registerAccount()
    {
        return true;
    }
    public boolean loginAccount()
    {
        if(isExistAccount())
            return true;
        else
            return false;
    }
    public boolean delete()
    {
        return true;
    }
    public boolean logoutAccount()
    {
        return true;
    }

    public boolean isExistAccount() //用户是否在数据库中存在
    {
        if(true)
            return true;
        else
            return false;
    }
    public boolean isRightPasswd() //用户密码是否正确
    {
        if(true)
            return true;
        else
            return false;
    }
    public String getAccount_name() {
        return Account_name;
    }

    public void setAccount_name(String account_name) {
        Account_name = account_name;
    }

    public String getAccount_passwd() {
        return Account_passwd;
    }

    public void setAccount_passwd(String account_passwd) {
        Account_passwd = account_passwd;
    }

}
