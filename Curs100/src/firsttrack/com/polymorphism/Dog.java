package firsttrack.com.polymorphism;

public class Dog extends Animal{
    public Dog(Integer weight) {
        super(weight);
    }

    @Override
    public String getVoice() {
        return "HamHam";
    }
}
