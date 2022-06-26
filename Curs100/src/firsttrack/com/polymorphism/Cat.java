package firsttrack.com.polymorphism;

public class Cat extends Animal{
    public Cat(Integer weight) {
        super(weight);
    }

    @Override
    public String getVoice() {
        return "miau";
    }
    public void bite(){
        System.out.println("auch");
    }
}
