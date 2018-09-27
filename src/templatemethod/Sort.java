package templatemethod;

import java.util.List;

public abstract class Sort {
    
    public List<Professor> bubbleSort(List<Professor> dados){
        for(int i = 0;i < dados.size(); i++){
            for(int j = i+1;j < dados.size(); j++){
                if(compare(dados.get(j),dados.get(i))){
                    Professor aux = dados.get(i);
                    dados.set(i, dados.get(j));
                    dados.set(j, aux);
                }
            }
        }
        return dados;
    }
    
    public abstract boolean compare(Professor a, Professor b);
}
