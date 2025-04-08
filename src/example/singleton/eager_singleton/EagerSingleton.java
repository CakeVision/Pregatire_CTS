package example.singleton.eager_singleton;


public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    static {
        System.out.println("Incarcare clasa de catre JVM");
        System.out.println("Preluare date de configurare aplicatie");
    }

    //se executa inainte de fiecare cosntructor
    {
        System.out.println("Apel inainte de constructor");
    }

    private EagerSingleton() {
        //preluare date conexiune din fisiere, servicii Web, etc
        System.out.println("Creare conexiune");
    }
}
