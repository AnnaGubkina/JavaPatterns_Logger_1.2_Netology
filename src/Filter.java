import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int f = 0;
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (i <= treshold) {
                logger.log("Элемент " + i + " не проходит");
            } else {
                logger.log("Элемент " + i + " проходит");
                result.add(i);
                f++;
            }
        }
        logger.log(f + " элементов прошли фильтр из " + source.size());
        logger.log("Выводим список элементов на экран ");
        System.out.println(result);
        return result;
    }
}
