package firsttrack.com.abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // LocalDate myObj = LocalDate.now(); Create a date object
       // System.out.println(myObj);  Display the current date
        Animal animal=new Cat(10);
        // System.out.println(animal.getVoice());
        List<Animal> animals=new ArrayList<>();
        animals.add(new Cat(82));
        animals.add(new Dog(22));

    for(Animal a: animals){
     //   System.out.println(a.getVoice());
    }
    Person person=new Person(new Dog(23));
    person.talk();
    }
}
