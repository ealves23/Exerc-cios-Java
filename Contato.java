
public class Contato {
    String nome;
    int Value;
    int Key;
    
    
    public Contato(String nome, int value) {
        this.nome = nome;
        Value = value;
    }
    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", Value=" + Value + ", Key=" + Key + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getValue() {
        return Value;
    }
    public void setValue(int value) {
        Value = value;
    }
    public int getKey() {
        return Key;
    }
    public void setKey(int key) {
        Key = key;
    }



}
