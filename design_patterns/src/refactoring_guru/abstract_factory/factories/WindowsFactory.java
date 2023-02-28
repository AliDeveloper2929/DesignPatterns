package refactoring_guru.abstract_factory.factories;

import refactoring_guru.abstract_factory.buttons.Button;
import refactoring_guru.abstract_factory.buttons.WindowsButton;
import refactoring_guru.abstract_factory.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
