package ui;

import model.CharacterModel;


public class SaveByCleanse {
    private CharacterModel kimoto;

    public SaveByCleanse() {
        init();
        kimoto.add();
    }

    //instantiates the class CharacterModel
    public void init(){
        if (kimoto == null){
        kimoto = new CharacterModel();
        }
    }
}
