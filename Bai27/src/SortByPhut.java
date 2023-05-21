import java.util.Comparator;

public class SortByPhut implements Comparator<Game> {
    @Override
    public int compare(Game o1 , Game o2){
        int time1 = o1.Choi();
        int time2 = o2.Choi();
        if (time1 == time2){
            return o1.getUser().compareTo(o2.getUser());
        }
        return -Integer.compare(time1 , time2);
    }
}
