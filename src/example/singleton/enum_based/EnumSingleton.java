package example.singleton.enum_based;

public enum EnumSingleton {
    INSTANCE{
        @Override
        public void sayHello(){
            System.out.println("Hello");
        }
    };

    private EnumSingleton(){

    }
    abstract void sayHello();
}
