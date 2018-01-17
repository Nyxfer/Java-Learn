import java.security.SecureRandom;

public class Marathon {
    // compare times one by one
    private static void fastestRunner1(String[] names, int[] times)
    {
        String minName = names[0];
        int minTimes = times[0];

        for (int i = 1; i < names.length; i++)
        {
            if (minTimes > times[i])
            {
                minName = names[i];
                minTimes = times[i];
            }
        }
        System.out.println("The fastest runner is: " + minName + " and the " +
                "time" +
                " is: " + minTimes + "s");
    }

    // rank the Runner and print the no.? fastest runner with time
    private static void rankRunner1(String[] names, int[] times, int rank,
                                    boolean ifwholeRank)
    {
        String[] ranknameRunner = new String[names.length];
        int[] ranktimesRunner = new int[names.length];

        for (int i = 0; i < names.length; i++)
        {
            int comTime = times[i];
            int count = 0;

            for (int j = 0 ;j < names.length; j++)
            {
                if (comTime > times[j])
                {
                    count += 1;
                }
            }
            ranktimesRunner[count] = comTime;
            ranknameRunner[count] = names[i];
        }

        if (ifwholeRank) {
            for (int k = 0; k < names.length; k++)
            {
                System.out.println(k + 1 + " name: " + ranknameRunner[k] + ", " +
                        "time: " + ranktimesRunner[k]);
            }
            System.out.println("The no." + rank + " is: " + ranknameRunner[rank - 1]
                    + " spending " + ranktimesRunner[rank - 1] + "s");
        }
        else
        {
            System.out.println("The no." + rank + " is: " + ranknameRunner[rank - 1]
                    + " spending " + ranktimesRunner[rank - 1] + "s");
        }

    }

    public static void main (String[] arguments)
    {
        String[] names =
                {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
                };

        int[] times =
                {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
                };

        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i] + ": " + times[i]);
        }

        fastestRunner1(names, times);

        rankRunner1(names, times, 2, true);
    }
}
