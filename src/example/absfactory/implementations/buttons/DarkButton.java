package example.absfactory.implementations.buttons;

import example.absfactory.interfaces.IButton;

public class DarkButton implements IButton {
    @Override
    public void onClick() {
        System.out.println("DarkButton Clicked");
    }

    @Override
    public void render() {
        System.out.println("DarkButton Rendered");
    }

}
