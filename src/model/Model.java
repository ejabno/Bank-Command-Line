package model;

import controller.Controller;
import view.View;

public class Model {
    private Controller controller;
    private View view;

    private VaultManager vaultManager;

    public Model(Controller controller, View view) {
        this.controller = controller;
        this.view = view;
        this.vaultManager = new VaultManager();
    }

    public void startProgram() {
        Thread vaultManagerThread = new Thread(this.vaultManager);
        Thread controllerThread = new Thread(this.controller);
        Thread viewThread = new Thread(this.view);
        vaultManagerThread.start();
        controllerThread.start();
        viewThread.start();
    }
}
