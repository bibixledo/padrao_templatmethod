package templatemethod;

public class SortDepart extends Sort{
    @Override
    public boolean compare(Professor a, Professor b) {
        int comp = a.getDepartamento().compareTo(b.getDepartamento());
        return comp < 0;
    }
    
}
