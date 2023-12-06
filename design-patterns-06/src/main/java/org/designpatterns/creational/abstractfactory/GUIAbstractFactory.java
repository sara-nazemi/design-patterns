package org.designpatterns.creational.abstractfactory;

public interface GUIAbstractFactory {
    Button createButton();

    Checkbox createCheckbox();
}

interface Button {
}

interface Checkbox {
}

class WindowsButton implements Button {
}

class MacButton implements Button {
}

class WindowsCheckbox implements Checkbox {
}

class MacCheckbox implements Checkbox {
}

class WindowsFactory implements GUIAbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIAbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

class Main {
    public static void main(String[] args) {
        GUIAbstractFactory guiWindows = new WindowsFactory();
        guiWindows.createButton();

        GUIAbstractFactory macGui = new MacFactory();
        macGui.createButton();
    }
}