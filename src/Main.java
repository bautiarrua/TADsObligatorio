import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(10);
        lista.add(200);
        lista.add(300);
        lista.add(100);
        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

}