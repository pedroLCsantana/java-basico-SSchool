package abristracao.animais;

import abristracao.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    // Atributos
    protected String nome;
    protected String tipoAnimal;
    protected short idade;
    protected String habitat;
    protected byte qtPatas;
    protected float alturaM;
    protected double pesoKg;



    // Manipuladores
    protected double comidaIngerida = 0;
    protected int horasDormidas = 0;
    protected double kmPercorido = 0;




    @Override
    public void comer(double qtComer) {
        comidaIngerida += qtComer;
    }

    @Override
    public void moverSe(double qtPercorer) {
        kmPercorido += qtPercorer;
    }

    @Override
    public void dormir(int qtDormir) {
        horasDormidas += qtDormir;
    }
}
