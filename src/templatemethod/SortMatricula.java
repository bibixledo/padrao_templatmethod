package templatemethod;

public class SortMatricula extends Sort{

    @Override
    public boolean compare(Professor a, Professor b) {
        if(Integer.parseInt(a.getMatricula()) > Integer.parseInt(b.getMatricula()))
            return true;
        return false;
    }
    
}
