public class Example {

    public static void main(String[] args) {
        Person Vika = new Person(20, 169, 'f', 65, 121);
        Person Igor = new Person(43, 189, 'm', 87, 136);

        Vika.setIq(100000);
        Vika.setSex('z');
        Vika.setWeight(100000);
        Vika.setAge(10000);
        Vika.setHeight(10000);

        Igor.setIq(-10000);
        Igor.setSex('5');
        Igor.setWeight(-100000);
        Igor.setAge(-10000);
        Igor.setHeight(-10000);

        System.out.println("Vika age ="+ Vika.getAge() + "  | Рост = "+ Vika.getHeight() + " | Пол = " + Vika.getSex() + " | Вес = " + Vika.getWeight() + " | iq = " + Vika.getIq());

        System.out.println("Igor age = "+ Igor.getAge() + " | Рост = " + Igor.getHeight() + " | Пол = " + Igor.getSex() + " | Вес = " + Igor.getWeight() + "  | iq =  " + Igor.getIq());

        System.out.println(Igor.getAgeСat());


    }
}
