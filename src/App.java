public class App {
    public static void main(String[] args) { 
        Person personOne = new Person("Renato", Feeling.okay, Greeting.formal);
        Person personTwo = new Person("Lucas", Feeling.happy, Greeting.formal);

        personOne.Hello(personTwo);
        personTwo.HelloResponse(personOne);
        personOne.Bye(personTwo);
    }
}
