import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static class Dice{
        public String name;
        public Dice(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dice{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}