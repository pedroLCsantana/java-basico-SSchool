package abristracao.animais;

import abristracao.AnimalMarinhoIF;

public abstract class AnimalMarinhoAB extends AnimalAB implements AnimalMarinhoIF {

    public AnimalMarinhoAB(){
        this.tipoAnimal = "Marinho";
    }

    @Override
    public void nadar(double qtPercorer) {
        super.moverSe(qtPercorer);
    }
}
