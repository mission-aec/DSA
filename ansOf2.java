
import java.util.LinkedList;

public class ansOf2 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addFirst(7);
        l.addFirst(6);
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        System.out.println(l.toString());
        removeMid(l);
        System.out.println(l.toString());
    }

    static void removeMid(LinkedList<Integer> ls){
        if(ls.size() == 1) {
            ls.remove(0);
        }
        else if(ls.size()%2!=0){
            int mid = ls.size()/2;
            ls.remove(mid);
        }
        else{
            int mid = ls.size()/2 -1;
            ls.remove(mid);
            ls.remove(mid);
        }
    }
}
