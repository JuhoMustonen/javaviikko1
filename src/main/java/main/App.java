package main;

public class App 
{
    public static void main( String[] args ) {
        Animal datapoint = 
            new Animal("Pena", "Kissa", 9);

        System.out.println(datapoint.name);
        System.out.println(datapoint.species);
        System.out.println(datapoint.age);
    }
}