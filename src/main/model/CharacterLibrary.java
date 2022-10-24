package model;

import java.util.LinkedList;

public class CharacterLibrary {
    LinkedList<CharacterModel> aList = new LinkedList<>();

    public CharacterLibrary(){
        aList.clear();
    }

    public void addCharacter(CharacterModel name){
        aList.add(name);
    }
}
