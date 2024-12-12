package org.example;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

  /*  public Student() {
    }*/

    public String createName(String name){
        return name;
    }

    public int creatAge(int age){
        return age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Nom : "+name+
                ", âge : "+age+" ans.";
    }
}
