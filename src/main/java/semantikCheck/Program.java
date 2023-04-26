package semantikCheck;

import java.util.ArrayList;
import java.util.List;

public class Program {

    List<Class> classes;


    public Program() {

        this(null);
    }
    public Program(List<Class> _classes){
        this.classes = new ArrayList<>();
        if(_classes != null){
             this.classes.addAll(_classes);
        }
    }
}
