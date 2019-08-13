package misc;

import inter.Moveable;
import inter.Noiseable;


public class Person implements Noiseable, Moveable {
    //field
    private int weight;
    private int height;
    private int age;
    private char sex;
    private int iq;

    //specificators
    //public -- доступен отовсюду
    //protected --  доступен только потомкам
    //"package-local" -- доступно только внутри пакета
    //private -- доступен ТОЛЬКО из этого класса


    //геттер
    public int getWeight(){
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge(){
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getIq(){
     return iq;
    }

    //сеттер
    public void setHeight(int height) {
        this.height = height;
        if (height < 50) this.height = 50;
        else if (height > 250) this.height = 250;
    }

    public void  setAge(int age){
        this.age = age;
        if(age<1) this.age = 0;
        else if (age>110) this.age = 110;
    }

    public void setWeight(int weight){
        this.weight = weight;
        if (weight<0) this.weight = 0;
        else if (weight>665) this.weight = 665;
    }

    public void setSex(char sex) {
        this.sex = sex;
        if(sex!='f'& sex!='m'){
            this.sex ='n';
        }
    }

    public void setIq (int iq){
        this.iq = iq;
        if(iq<1) this.iq = 1;
        else if (iq>230) this.iq = 230;
    }

    public Person(int a, int h, char s, int w, int i){
        this.setWeight(w);
        this.setAge(a);
        this.setSex(s);
        this.setHeight(h);
        this.setIq(i);
    }



    //спецификатор тип-возвращаемого-значения название(параметры) {}
    //молодойб среднего возраста и пожилой
    public  String getAgeСat(){
        if (age<20) return "молодой";
        else if (age>=20&age<60) return "Среднего возраста";
        else return "пожилой";

    }


    @Override
    public void move() {
        System.out.println("step-by-step");
    }

    @Override
    public void sound() {
        System.out.println("AGHHHHHRR");
    }
}
