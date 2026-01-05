package coredsapractice.com.stacks;

class circulartour {

    static int findStart(int[] petrol, int[] distance) {
        int start = 0, fuel = 0, deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            fuel += petrol[i] - distance[i];

            if (fuel < 0) {
                deficit += fuel;
                start = i + 1;
                fuel = 0;
            }
        }

        return (fuel + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println("Start Index: " + findStart(petrol, distance));
    }
}

