import java.util.Scanner;


class Sentence{
    private String name;
    private String surname;
    private int age;
    private String lastWord;
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLastWord(String lastWord) {
        this.lastWord = lastWord;
    }
    public void createSent(){
        System.out.println(name + " "+ surname + " " + age + " " + lastWord);
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner j = new Scanner(System.in);
        Sentence g = new Sentence();
        g.setName(j.next());
        g.setSurname(j.next());
        g.setAge(j.nextInt());
        g.setLastWord(j.next());
        g.createSent();



    }
}