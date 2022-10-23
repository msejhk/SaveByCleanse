package ui;

import model.CharacterModel;
import model.RaceElf;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class SaveByCleanse {
    private CharacterModel goblin;
    private RaceElf anElf;
    private String name;
    private Scanner input;
    private String enteredValue;
    Random veryRandom = new Random();
    LinkedList<String> characterList = new LinkedList<>();


    public SaveByCleanse() {
        init();


    }

    //instantiates the class CharacterModel
    public void init(){
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
                RaceElf anElf = new RaceElf(name);
                System.out.println("You selected Elf, base HP-20, base ATK+4");
                break;
            case "orc":
                System.out.println("orc not yet implemented.");
                break;
            case "dwarf":
                System.out.println("dwarf not yet implemented.");
                break;
            default:
                System.out.println("Invalid selection, will select a random race");
                int n = veryRandom.nextInt(3);
                switch(n){
                    case 0:
                        anElf = new RaceElf(name);
                        System.out.println("You selected Elf, base HP-20, base ATK+4");
                        break;
                    case 1:
                        System.out.println("orc not yet implemented.");
                        break;
                    case 2:
                        System.out.println("dwarf not yet implemented.");
                        break;
                    default:
                        System.out.println("Exceptional error has occurred");
                        break;
                }
        }
        characterList.add(name);
        System.out.println("Name: " + goblin.getName() + " Race: " + enteredValue);
    }
}
