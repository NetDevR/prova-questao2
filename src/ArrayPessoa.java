import java.util.ArrayList;

public class ArrayPessoa {
    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public static ArrayList<Pessoa> getListaPessoas(){
        return listaPessoas;
    }

    static public void cadastrar(Pessoa p){
        listaPessoas.add(p);
    }

}
