public enum Feeling {
   okay("estou bem"),
   happy("estou feliz"),
   sad("estou meio triste"),
   tired("estou cansado"),
   angry("estou irritado!!"); 
    
    private String feeling;

    Feeling (String Inputfeel){
        this.feeling = Inputfeel;
    }
    public String getFeelingMsg(){
        return feeling;
    }
}