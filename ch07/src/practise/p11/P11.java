package practise.p11;

public class P11 {
    public static void main(String[] args) {
        StringBuffer sf=new StringBuffer(26);
        for (int i = 0; i <26 ; i++) {
            for (int j = 0; j <26 ; j++) {
                if(j==26-i-1){
                    char c=(char)(122-i);
                    sf.append(c);
                }
            }
        }
        String s=sf.substring(5);
        System.out.println(s);
    }
}
