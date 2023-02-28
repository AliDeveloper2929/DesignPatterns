package refactoring_guru.abstract_factory.factories;
import refactoring_guru.abstract_factory.buttons.Button;
import refactoring_guru.abstract_factory.checkboxes.Checkbox;
/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
