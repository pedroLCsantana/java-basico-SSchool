package abristracao.animais;

import abristracao.AnimalTerrestreIF;

public abstract class AnimalTerrestreAB extends AnimalAB implements AnimalTerrestreIF {

    public AnimalTerrestreAB(){
        this.tipoAnimal = "Terrestre";
    }
    @Override
    public void andar(double qtPercorer) {
        super.moverSe(qtPercorer);
    }
}
