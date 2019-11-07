package practise.p02;

public class Book {
    private String title;
    private int pageNum;
    public Book(String title,int pageNum){
        this.title=title;
        this.pageNum=pageNum;
    }
    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            System.out.println("错误信息");
            this.pageNum = 200;
        } else {
            this.pageNum = pageNum;
        }
    }
    public void detail(){
        System.out.println("书名："+title+"页数："+pageNum);
    }

}

