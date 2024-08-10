import java.util.Scanner;

interface voids{    //this definition allows to declare methods in advance, so as to use them several times in different situations
      void setName(String name); //method, that in future will be used to set a data to the variable "name"
      void setSurname(String surname);  //method, that in future will be used to set a data to the variable "surname"
      void setAge(int age);  //method, that in future will be used to set a data to the variable "age"
      void setLastWord(String lastWord);  //method, that in future will be used to set a data to the variable "lastWord"

      void createSent();   // method, that in future will create a sentence, using data from declared variables
}
class Sentence implements  voids{
    //variables are declared with a "private" access modifier. To get them, we should use methods
    private String name;
    private String surname;
    private int age;
    private String lastWord;

    @Override                              //@Override is used to make a new behaviour for the method, declared in the interface
    public void setName(String name) {
        this.name = name; //"this" is for using the same variable repeatedly, also it's referred to a declared method parameter
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

public class Main {
    public static void main(String[] args) {

        Scanner j = new Scanner(System.in); //Class "Scanner" allows us to write variable data by ourselves, "j" is an object of a class.
        // "System.in" is a method for entering data
        Sentence g = new Sentence();// "g" is an object of a class "Sentence"
        System.out.print("Write a name: ");
        g.setName(j.next());//We call methods and allow to enter data. "j.next" is used for a String type
        System.out.print("Write a last name: ");
        g.setSurname(j.next());
        System.out.print("Write an age: ");
        g.setAge(j.nextInt());//"j.nextInt" is used for an Integer type
        System.out.print("Write a last word: ");
        g.setLastWord(j.next());
        g.createSent();



    }
}