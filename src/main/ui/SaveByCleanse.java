package ui;

import model.*;
import model.exceptions.ErrorException;

import java.util.Random;
import java.util.Scanner;


public class SaveByCleanse {
    private CharacterModel goblin;
    private RaceElf anElf;
    private RaceOrc anOrc;
    private RaceDwarf aDwarf;
    private String name;
    private Scanner input;
    private String enteredValue;
    private String chosenRace;
    private int selectedNumRace;
    Random veryRandom = new Random();
    CharacterLibrary aLibrary = new CharacterLibrary();


    public SaveByCleanse() {
        runApp();
    }

    public void runApp(){
        boolean inOperation = true;
        String command = null;

        try {
            chosenRace = init();

            while (inOperation) {
                if(chosenRace.contains("elf")) {
                    displayMenu(anElf);
                } else if (chosenRace.contains("orc")){
                    displayMenu(anOrc);
                } else if (chosenRace.contains("dwarf")){
                    displayMenu(aDwarf);
                } else {
                    System.out.println("something went wrong.");
                }

                command = input.nextLine();
                command = command.toLowerCase();
                if (command.equals("quit")) {
                    inOperation = false;
                }
            }

        } catch (ErrorException e) {
            System.out.println("An Exceptional error has occurred!");
        }

    }
    //instantiates the class CharacterModel
    public String init() throws ErrorException {
        System.out.println("Enter the desired username for the character");
        input = new Scanner(System.in);
        name = input.nextLine();
        input.useDelimiter("\n");
        if (goblin == null){
        goblin = new CharacterModel(name);
        }
        System.out.println("Created the character: " + goblin.getName());
        System.out.println("\nPlease choose a race.\nElf\nOrc\nDwarf");
        input = new Scanner(System.in);
        enteredValue = input.nextLine();
        enteredValue = enteredValue.toLowerCase();
        switch(enteredValue){
            case "elf":
                anElf = new RaceElf(goblin.getName());
                System.out.println("You selected Elf, base HP-20, base ATK+4");
                selectedNumRace = 1;
                break;
            case "orc":
                anOrc = new RaceOrc(goblin.getName());
                System.out.println("You selected Orc, base HP+50, base ATK+1");
                selectedNumRace = 2;
                break;
            case "dwarf":
                aDwarf = new RaceDwarf(goblin.getName());
                System.out.println("You selected Dwarf, base HP+0, base ATK+2, buff: Rapid Growth");
                selectedNumRace = 3;
                break;
            default:
                System.out.println("Invalid selection, will select a random race");
                int n = veryRandom.nextInt(3);
                switch(n){
                    case 0:
                        anElf = new RaceElf(name);
                        System.out.println("You selected Elf, base HP-20, base ATK+4");
                        enteredValue = "Elf";
                        selectedNumRace = 1;
                        break;
                    case 1:
                        anOrc = new RaceOrc(name);
                        System.out.println("You selected Orc, base HP+50, base ATK+1");
                        enteredValue = "Orc";
                        selectedNumRace = 2;
                        break;
                    case 2:
                        aDwarf = new RaceDwarf(name);
                        System.out.println("You selected Dwarf, base HP+0, base ATK+2, buff: Rapid Growth");
                        enteredValue = "Dwarf";
                        selectedNumRace = 3;
                        break;
                    default:
                        System.out.println("Exceptional error has occurred");
                        break;
                }
        }
        if (selectedNumRace == 1){
            aLibrary.addCharacter(anElf);
        } else if (selectedNumRace == 2){
            aLibrary.addCharacter(anOrc);
        } else if (selectedNumRace == 3){
            aLibrary.addCharacter(aDwarf);
        }
        chosenRace = enteredValue;
        return chosenRace;
    }

    public void displayMenu(CharacterModel aModel){

        System.out.println("-----------------");
        System.out.println("Race: " + chosenRace + "\nName: " + name + "\nLvl: " + aModel.getLevel());
        System.out.println("EXP: " + aModel.getCurrentEXP());
        System.out.println("\n");
        System.out.println("Fight");
        System.out.println("Quit");
        System.out.println("-----------------");
    }
}
