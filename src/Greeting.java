public enum Greeting {
    formal("olá, como você está?"), 
    nice("oi, como vc tá?"), 
    friend("eaee, como vc tá??");

    private String greeting;

    Greeting(String InputMsg) {
        this.greeting = InputMsg;
    }
    public String getGreetingMsg(){
        return greeting;
    }
}