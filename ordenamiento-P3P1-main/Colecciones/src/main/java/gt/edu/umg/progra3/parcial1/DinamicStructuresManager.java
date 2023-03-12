package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager <T extends Comparable <T>> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        //inserte codigo aqui
        Collections.sort(values);

        return values;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        Collections.sort(values,Collections.reverseOrder());
        return values;
    }

}
