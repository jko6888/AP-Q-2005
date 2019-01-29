package JamesKo;

public class StudentRecord {
    private int[] scores;

    private double average(int first, int last)
    {
        double average = 0;
        for(int i = first; i<= last;i++)
        {
            average += scores[i];
        }
        return average/(last-first);
    }

    private boolean hasImproved()
    {
        int count=0;
        for(int i = 0;i<scores.length;i++)
        {
            if(scores[i+1] > scores[i])
            {
                count++;
                if(count == scores.length)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public double finalAverage()
    {
        if(hasImproved())
        {
            average(scores.length/2,scores.length);
        }
        return average(0,scores.length);
    }
}