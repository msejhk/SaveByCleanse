package ui;

import model.CharacterModel;


public class WorlDom {
    private CharacterModel kimoto;

    public WorlDom() {
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
