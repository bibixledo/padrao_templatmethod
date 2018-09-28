package templatemethod;

public class SortHorst extends Sort{

    @Override
    public boolean compare(Professor a, Professor b) {
        int comp = a.getHorista().compareTo(b.getHorista());
        return comp < 0;
    }
    
}
