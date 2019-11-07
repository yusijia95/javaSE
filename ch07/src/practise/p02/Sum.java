package practise.p02;

public class Sum {
    public static void main(String[] args) {

        String str = "这些年一个人，风也过，雨也过,有过泪,有过错，还记得坚持什么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中。";
//        int count = str.indexOf("过");
//        System.out.println(str.indexOf("过"));
        String str2=str.replace("过","");
        int count=str.length()-str2.length();
        System.out.println(count);
    }
}
