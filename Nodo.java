
/**
 * @author Pablo Ortiz
 * @author Pedro Garcia 
 * @author Dieter de Wit
 * @version 07.11.16
 */


public class Nodo implements Comparable<Nodo>{
    private Integer num;
    private String name;

    public Nodo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    public String getName(){
        return name;
    }
    
    
    @Override
    public int compareTo(Nodo p){
        return num.compareTo(p.getNum());
    }
    
    
    
}
