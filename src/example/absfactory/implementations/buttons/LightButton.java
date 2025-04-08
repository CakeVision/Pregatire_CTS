package example.absfactory.implementations.buttons;


import example.absfactory.interfaces.IButton;

public class LightButton implements IButton {
    @Override
    public void onClick() {
        System.out.println("LightButton Clicked");
    }

    @Override
    public void render() {
        System.out.println("LightButton Rendered");
    }
}
