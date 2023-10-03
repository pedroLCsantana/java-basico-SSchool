package abristracao.animais;

import abristracao.AnimalVoadorIF;

public abstract class AnimalVoadorAB extends AnimalAB implements AnimalVoadorIF {
    protected int qtAssas;
    protected float envergaduraAssa;

    public AnimalVoadorAB(){
        this.tipoAnimal = "Voador";
    }

    @Override
    public void voar(double qtPercorer) {
        super.moverSe(qtPercorer);
    }
}
