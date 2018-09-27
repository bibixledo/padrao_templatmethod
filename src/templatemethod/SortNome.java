package templatemethod;

public class SortNome extends Sort{

    @Override
    public boolean compare(Professor a, Professor b) {
        int comp = a.getNome().compareTo(b.getNome());
        return comp >= 0;
    }
    
}
