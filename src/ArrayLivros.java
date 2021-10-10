import java.util.ArrayList;

public class ArrayLivros {
    private static ArrayList<Livro> listaLivros = new ArrayList<>();

    public static ArrayList<Livro> getlistaLivros(){
        return listaLivros;
    }

    static public void cadastrar(Livro l){
        listaLivros.add(l);
    }

}
