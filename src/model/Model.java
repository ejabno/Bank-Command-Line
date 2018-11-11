package model;

import controller.Controller;
import view.View;

public class Model {
    private Controller controller;
    private View view;

    public Model(Controller controller, View view) {
        this.controller = controller;
        this.view = view;
    }

    public void startProgram() {

    }
}
