package example.absfactory.implementations.textfields;

import example.absfactory.interfaces.ITextField;

public class DarkTextField implements ITextField{
    @Override
    public void render() {
        System.out.println("DarkTextField Rendered");
    }

    @Override
    public void onType() {
        System.out.println("DarkTextField TypedIn");
    }
}
