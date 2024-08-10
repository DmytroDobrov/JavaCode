import java.util.Scanner;

interface voids{
      void setName(String name);
      void setSurname(String surname);
      void setAge(int age);
      void setLastWord(String lastWord);

      void createSent();
}
class Sentence implements  voids{
    private String name;
    private String surname;
    private int age;
    private String lastWord;
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setLastWord(String lastWord) {
        this.lastWord = lastWord;
    }
    @Override
    public void createSent(){
        System.out.println(name + " "+ surname + " " + age + " " + lastWord);
    }
}
class AlterSent extends Sentence{

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