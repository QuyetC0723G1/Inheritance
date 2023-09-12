package animal;

class Horse extends Animal {
    String color ;
    public Horse(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public void eat(){
        System.out.println(this.name + " is eating ");
    }

    @Override
    public void kick() {
        System.out.println(this.name + " Sút tung mõm ");
        super.makeSound();
    }

}
