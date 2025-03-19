package AulasJava;
import AulasJava.Pessoa;

/** Sempre que criar uma nova instãncia de Pessoa no Programa.Java,
 * o construtor no Pessoa.Java é chamado;
 */

public class Programa { //CLASSE COM METODO PRINCIPAL
    public static void main(String[] args) {
        Pessoa testePessoa1 = new Pessoa(); //CHAMA O COSNTRUTOR PADRÃO
        Pessoa testePessoa2 = new Pessoa("Fred"); //CHAMA O CONSTRUTOR COM PARÂMETRO
        Pessoa testePessoa3 = new Pessoa("GaldiLuna", "0000"); //CHAMANDO UM CONSTRUTOR DENTRO DE OUTRO
    }
}
