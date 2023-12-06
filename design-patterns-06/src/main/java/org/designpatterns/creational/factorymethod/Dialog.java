package org.designpatterns.creational.factorymethod;

public abstract class Dialog {

    public void render() {
        createButton();
    }

    public abstract Button createButton();
}

class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WebButton();
    }
}

interface Button {
}

class WindowsButton implements Button {
}

class WebButton implements Button {
}

class Main {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();
    }
}
