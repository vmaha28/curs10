package firsttrack.com.abstractClasses;

public abstract class Animal {
    private Integer weight;

    public Animal(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }
    public abstract String getVoice();
}
