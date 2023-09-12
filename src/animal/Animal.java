package animal;

 class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
     protected String getName() {
         return name;
     }
     protected int getAge() {
         return age;
     }
     public void run(){
         System.out.println(this.name + " is running ");
     }

     @Override
     public String toString() {
         return "Animal{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
     protected void kick(){
         System.out.println(this.name + " is kicking");
     }
     protected void makeSound(){
         System.out.println("Hí hí hí hí...");
     }

 }
