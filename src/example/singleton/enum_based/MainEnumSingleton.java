package example.singleton.enum_based;

public class MainEnumSingleton {
    public static void main(String[] args){
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.sayHello();
    }
}
