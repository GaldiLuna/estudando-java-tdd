//IMPORTAÇÃO DOS PACOTES/PASTAS, OUTROS ARQUIVOS E FRAMEWORKS
package AulasJava;
import AulasJava.Programa;

/** AulasJava.
 * Construtores são métodos especiais que são chamados quando
 * criamos a instância de um objeto a partir de uma classe;
 * O construtor terá sempre o mesmo nome da classe;
 * Sempre que criar uma nova instãncia de Pessoa no Programa.Java,
 * o construtor no Pessoa.Java é chamado;
 * Quando o metodo não retornar nada, precisa ter explicitamente o nome VOID,
 * já o construtor não precisa ser declarado como VOID;
 * O construtor pode ser declarado com ou sem parâmetros
 * e pode ser chamado dentro de outro construtor;
 * Na herança o contrutor pai é chamado dentro do filho através do super ao invés do this;
 * Contrutores servem apenas para inicializar os objetos e não devem conter validações,
 * essas ficam para dentro dos métodos específicos;
*/

//CRIAÇÃO DA CLASSE
public class Pessoa {

    //DECLARAÇÃO DE VARIÁVEIS
    private String nome;
    private String cpf;

    public Pessoa() { //CONSTRUTOR PADRÃO
        this.nome = "";
    }

    public Pessoa(String nome) { //CONSTRUTOR COM PARÂMETRO
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome); //CHAMANDO OUTRO CONSTRUTOR DENTRO DESSE
        this.cpf = cpf;
    }


    public void setNome(String nome) { //METODO
        this.nome = nome;
    }
}

