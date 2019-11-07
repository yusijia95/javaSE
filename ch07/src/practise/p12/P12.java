package practise.p12;

public class P12 {
    public static void main(String[] args) {
        String str="abcdefg";
        P12 en=new P12();
        StringBuffer sf=en.rollback(str,1,2);
        System.out.println(sf);

    }
    public StringBuffer rollback(String str,int begin,int end){
        char [] arr=new char[str.length()];
        arr=str.toCharArray();
        for (int i = 0; i <end-begin ; i++) {
            char temp=arr[begin+i];
            arr[begin+i]=arr[end-i];
            arr[end-i]=temp;
        }
        StringBuffer sf=new StringBuffer(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            sf.append(arr[i]);
        }
        return sf;
    }
}
