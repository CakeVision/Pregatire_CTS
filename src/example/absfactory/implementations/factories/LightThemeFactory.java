package example.absfactory.implementations.factories;

import example.absfactory.implementations.buttons.LightButton;
import example.absfactory.implementations.textfields.LightTextField;
import example.absfactory.interfaces.IButton;
import example.absfactory.interfaces.ITextField;
import example.absfactory.interfaces.IUIFactory;

public class LightThemeFactory implements IUIFactory {

    @Override
    public IButton createButton() {
        return new LightButton();
    }

    @Override
    public ITextField createTextField() {
        return new LightTextField();
    }
}
