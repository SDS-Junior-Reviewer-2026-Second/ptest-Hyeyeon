public interface Coffee {
    void drank();
} 

class Americano implements Coffee {
    private int shot;
    private int water;

    Americano(int shot, int water) {
        this.shot = shot;
        this.water = water;
    }

    @Override
    public void drank() {
        // TODO Auto-generated method stub
        System.out.println("아메리카노 좋아");

    }

}


class Latte implements Coffee {
    private int shot;
    private int milk;
    Latte(int shot, int milk){
        this.shot = shot;
        this.milk = milk;
    }
    @Override
    public void drank() {
        System.out.println("라떼 아트 좋아");
    }

}

class CoffeeFactory {
    Coffee create(String type, String Size){
        if(type.equals("Americano")){
            if(Size.equals("s"))   return new Americano(2, 10);
            else if( Size.equals("m")) return new Americano(3, 14);
            else if(Size.equals("l")) return new Americano(10, 5);
        } else if(type.equals("Latte")){
            if(Size.equals("s"))   return new Latte(2, 10);
            else if( Size.equals("m")) return new Latte(3, 14);
            else if(Size.equals("l")) return new Latte(10, 5);
        }
    }

}