package Exericios.Interfaces.src.abristracao.animais;

import Exericios.Interfaces.src.abristracao.AnimalTerrestreIF;

public abstract class AnimalTerrestreAB extends AnimalAB implements AnimalTerrestreIF {

    public AnimalTerrestreAB(){
        this.tipoAnimal = "Terrestre";
    }
    @Override
    public void andar(double qtPercorer) {
        super.moverSe(qtPercorer);
    }
}
