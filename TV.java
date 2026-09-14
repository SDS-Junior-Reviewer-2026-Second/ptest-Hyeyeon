public class TV implements RemoteControl {

    @Override 
    public void turnOn(){
        System.out.println("TV 키기");
    }
    @Override 
    public void turnOff(){
        System.out.println("TV 끄기");
    }

}