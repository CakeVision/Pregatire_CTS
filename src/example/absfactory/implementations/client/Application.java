package example.absfactory.implementations.client;

import example.absfactory.interfaces.IButton;
import example.absfactory.interfaces.ITextField;
import example.absfactory.interfaces.IUIFactory;

public class Application {
    public IButton button;
    public ITextField textField;

    public Application(IUIFactory factory){
        button = factory.createButton();
        textField = factory.createTextField();
    }
    public void render(){
        button.render();
        textField.render();
    }

    public void interact(){
        button.onClick();
        textField.onType();
    }
}
