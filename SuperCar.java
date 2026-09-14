public abstract class SuperCar {
    final static String PORSCHE = "Porsche";
    final static String FERRARI = "Ferrari";
    final static String AVANTEN = "AvanteN";
    String carName;
    public SuperCar(String carName) { this.carName = carName; }
    abstract void ride();
}

class Porsche extends SuperCar {
    Porsche(String carName) {super(carName);}

    @Override 
    void ride(){
        System.out.println("포르릉");
    }
}

class Avanten extends SuperCar {
    Avanten(String carName) {super(carName);}

    @Override 
    void ride(){
        System.out.println("에바바바");
    }
}


class Ferrari extends SuperCar {
    Ferrari(String carName) {super(carName);}
    
    @Override 
    void ride(){
        System.out.println("페라라");
    }
}