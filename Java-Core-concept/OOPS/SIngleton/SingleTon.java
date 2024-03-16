package OOPS.SIngleton;

public class SingleTon {
    private SingleTon()
    {

    }

    private static SingleTon instance;

    public static SingleTon getinstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}

