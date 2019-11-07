package practise.p10;

public class Account {
    private String account;
    private String name;
    private int date;
    private String idCard;
    private String money;

    public Account(String account, String name, int date, String idCard, String money) {
        this.account = account;
        this.name = name;
        this.date = date;
        this.idCard = idCard;
        this.money = money;
    }

    public Account() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", idCard='" + idCard + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
