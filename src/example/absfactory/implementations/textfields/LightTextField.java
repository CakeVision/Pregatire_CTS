package example.absfactory.implementations.textfields;

import example.absfactory.interfaces.ITextField;

public class LightTextField implements ITextField {
    @Override
    public void render() {
        System.out.println("LightTextField Rendered");
    }

    @Override
    public void onType() {
        System.out.println("LightTextField TypedIn");
    }
}
