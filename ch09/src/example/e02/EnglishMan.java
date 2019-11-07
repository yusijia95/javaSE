package example.e02;

public class EnglishMan implements Comparable {
    private String name;
    private int score;

    @Override
    public int compareTo(Object o) {
        EnglishMan per = (EnglishMan) o;
        int num = per.getName().length() - this.getName().length();
        if (num != 0) {
            return num;
        }
        for (int i = 0; i < this.getName().length(); i++) {

        }
        return num;

    }

    public EnglishMan() {
    }

    public EnglishMan(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "EnglishMan{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
