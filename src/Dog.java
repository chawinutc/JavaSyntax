public class Dog {
    private String name;
    private String breed;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void run(){
        IO.println(String.format("Run....."));
    }
    public void bark(int round){
        for(int x=1;x<=round;x++){
            IO.println(String.format("Wow !"));
        }
    }

}
