package firsttrack.com.polymorphism;

public class Person {
    private Animal pet;

    public Person(Animal pet) {
        this.pet = pet;
    }

    public void talk(){
        System.out.println("whats up");
        System.out.println(pet.getVoice());

    }
}
