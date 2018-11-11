package main;

import controller.Controller;
import model.Model;
import view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View();
	    Model model = new Model(controller, view);

	    model.startProgram();
    }
}
