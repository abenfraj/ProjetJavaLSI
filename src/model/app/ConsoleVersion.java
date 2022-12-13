package model.app;

public class ConsoleVersion {

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Welcome !");
        System.out.println("The goal of this project is to manage different geometrical shapes through the console, using your inputs, images and drawings");
        System.out.println("An image is a collection of shapes. Remember that you can only have one type of each shape in an image.");
        System.out.println("**************************************");
        Launcher gameLauncher = new Launcher();
        gameLauncher.welcome();
    }

}
