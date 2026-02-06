package Singleton;

public class PractiseSingleton {

    int counter;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private static PractiseSingleton practiseSingleton;

    private PractiseSingleton(){};

    public int increment(){
        return ++counter;
    }

    public static PractiseSingleton getInstance(){
        if(practiseSingleton == null)
            practiseSingleton = new PractiseSingleton();
        return practiseSingleton;
    }

    public void print(String msg){
        System.out.println(msg);
    }
}
