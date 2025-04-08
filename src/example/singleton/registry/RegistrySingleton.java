package example.singleton.registry;

import java.util.HashMap;

public class RegistrySingleton {
    private static HashMap<String, RegistrySingleton> registerMap = new HashMap<>();

    private RegistrySingleton(){}
    private static RegistrySingleton getInstance(String key){
        RegistrySingleton instance = registerMap.get(key);
        if(instance == null){
            instance = new RegistrySingleton();
            registerMap.put(key, instance);
        }
        return instance;
    }
}
