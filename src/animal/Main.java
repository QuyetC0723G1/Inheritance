package animal;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Chó Sói",9);
//        animal.kick();
        Animal animal = new Horse("Ngua",4,"Black");


        Horse nguavan = new Horse("Ngựa Vằn",7,"Black&White");
        Horse nguaMongco = new Horse("Xích Thố",5,"Black");
        Horse ngua1 = (Horse)  animal;
        ngua1.eat();
//        nguavan.run();
//        System.out.println(nguavan + " color : " + nguavan.color);
//        nguavan.kick();
//        nguaMongco.makeSound();
//        Animal animal1 = nguaMongco;
//        animal1.kick();
    }
}
