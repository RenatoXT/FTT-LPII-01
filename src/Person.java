public class Person {
    private String name;
    private Feeling feeling;
    private Greeting greeting;

    public Person(String ConstName, Feeling ConstMessage, Greeting ConstGreeting){
        this.setName(ConstName);
        this.setMessage(ConstMessage);
        this.setGreeting(ConstGreeting);
    }


    public String getName(){
       return name;
    }
    public void setName(String InputName){
        this.name = InputName;
    }

    public Feeling getMessage(){
        return feeling;
    }
    public void setMessage(Feeling InputMessage){
        this.feeling = InputMessage;
    }

    public Greeting getGreeting(){
        return greeting;
    }
    public void setGreeting(Greeting InputGreeting){
        this.greeting = InputGreeting;
    }

    public void Hello(Person InputPerson){
        System.out.println(this.getName() + ":\n" + InputPerson.getName() + "!!\n " + this.getGreeting().getGreetingMsg());
    }
    public void HelloResponse(Person InputPerson){
        System.out.println(this.getName() + ":\n" + this.getMessage().getFeelingMsg() +  " e vc " + InputPerson.getName() + " ?");
    }
    public void Bye(Person InputPerson){
        System.out.println(this.getName() + ":\n" + this.getMessage().getFeelingMsg());
    }
}