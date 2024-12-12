class Marathon {

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        int indexOfLowestTime = getIndexOfLowestTime(times);
        System.out.printf("The fastest runner: %s (%d)\n",
            names[indexOfLowestTime], times[indexOfLowestTime]);

        int indexOfSecondLowestTime = getIndexOfSecondLowestTime(times);
        System.out.printf("The second fastest runner: %s (%d)\n",
            names[indexOfSecondLowestTime], times[indexOfSecondLowestTime]);
    }

    public static int getIndexOfLowestTime(int[] times) {
        int indexOfLowestTime = -1;
        int lowestTime = Integer.MAX_VALUE;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < lowestTime) {
                indexOfLowestTime = i;
                lowestTime = times[indexOfLowestTime];
            }
        }

        return indexOfLowestTime;
    }

    public static int getIndexOfSecondLowestTime(int[] times) {
        int indexOfLowestTime = getIndexOfLowestTime(times);
        int lowestTime = times[indexOfLowestTime];

        int indexOfSecondLowestTime = -1;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < times.length; i++) {
            if (i == indexOfLowestTime) {
                continue;
            }

            if ((times[i] - lowestTime) < diff) {
                indexOfSecondLowestTime = i;
            }
        }

        return indexOfSecondLowestTime;
    }

} 