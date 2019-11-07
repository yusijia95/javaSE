package practise.s01;

public class Question {
    private int number;
    private String title;
    private int answerA;
    private int answerB;
    private int answerC;
    private int answerD;

    public void question(int i, int num) {
        System.out.println("question" + num + ":");
        System.out.println(i + "+" + i + "=");
        this.answerA = i+i;
        this.answerB = i+i-1;
        this.answerC = i+i+1;
        this.answerD = i;
        System.out.println("A=" + this.answerA + "  B=" + this.answerB + "  C=" + this.answerC + "  D=" + this.answerD);
    }

    public int answer(String answer, int sum) {
        if (answer.equals("A")) {
            System.out.println("回答正确。");
            return sum + 5;
        }else{
            System.out.println("回答错误。");
            return sum;
        }
    }
}
