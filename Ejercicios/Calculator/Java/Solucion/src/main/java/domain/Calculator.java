package domain;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> values = new ArrayList<Integer>();

    public void Enter(int number)
    {
        values.add(number);
    }

    public int Add()
    {
        if (values.size() > 1)
        {
            return values.get(values.size() - 1) + values.get(values.size() - 2);
        }

        return values.get(0);

    }
}
