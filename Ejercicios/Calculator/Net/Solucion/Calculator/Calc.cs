using System.Collections.Generic;

namespace Calculator.Library
{
    public class Calc
    {
        private List<int> values = new List<int>();

        public void Enter(int number)
        {
            values.Add(number);
        }

        public int Add()
        {
            if (values.Count > 1)
            {
                return values[values.Count - 1] + values[values.Count - 2];
            }

            return values[0];

        }
    }
}
