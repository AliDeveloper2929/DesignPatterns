package refactoring_guru.abstract_factory.app;
import refactoring_guru.abstract_factory.buttons.Button;
import refactoring_guru.abstract_factory.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.factories.GUIFactory;
/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
