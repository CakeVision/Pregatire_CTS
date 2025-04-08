package example.absfactory.implementations.factories;

import example.absfactory.implementations.buttons.DarkButton;
import example.absfactory.implementations.buttons.LightButton;
import example.absfactory.implementations.textfields.DarkTextField;
import example.absfactory.implementations.textfields.LightTextField;
import example.absfactory.interfaces.IButton;
import example.absfactory.interfaces.ITextField;
import example.absfactory.interfaces.IUIFactory;

public class DarkThemeFactory implements IUIFactory {
        @Override
        public IButton createButton() {
            return new DarkButton();
        }

        @Override
        public ITextField createTextField() {
            return new DarkTextField();
        }
}