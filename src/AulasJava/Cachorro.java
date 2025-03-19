package AulasJava;

/**
 * Na herança o contrutor pai é chamado dentro do filho através do super ao invés do this;
 */

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }
}
