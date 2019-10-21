package job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = second;
        if ((first <= second && first <= third))

            if ((second <= third && second <= first))

                if ((third <= second && third >= first))
                    return result;

        return result;
    }

}
