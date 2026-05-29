void main() {
    int[] numbers = new int[5];
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    for (int i = 0; i < numbers.length; i++) {
        IO.println(numbers[i]);
    }

    //Enhanced for loop
    for (int number : numbers) {
        IO.println(number);
    }

    IO.println(Arrays.toString(numbers));

    //Array copying

    //Lottery Drawing
    {
        int k = Integer.parseInt(IO.readln("How many numbers do you need to draw? "));
        int n = Integer.parseInt(IO.readln("What is the highest number you can draw? "));

        // fill an array with numbers 1 2 3 . . . n
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++)
            num[i] = i + 1;

        // draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);

            // pick the element at the random location
            result[i] = num[r];

            // move the last element into the random location
            num[r] = num[n - 1];
            n--;
        }

        // print the sorted array
        Arrays.sort(result);
        IO.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            IO.println(r);
    }

}