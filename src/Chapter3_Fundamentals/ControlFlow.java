void main() {
    //Nested blocks
    int i = Integer.parseInt(IO.readln("Enter a number: "));
    {
        int c;
        {
            int a;
        }
        int a;
    }

    //Conditional statements
    if (i > 0) {
        System.out.println("i is positive");
    } else if (i < 0) {
        System.out.println("i is negative");
    } else {
        System.out.println("i is zero");
    }

    if(i < 0) if (i > -10) System.out.println("i is between -10 and 0");

    //Loops
    for (int h = 1, j = 10,t = 1; h <= 10; h++, j-- , t=t-2) {
        System.out.println("h: " + h + " j: " + j + " t: " + t);
    }

    //Multiple sections
    //No fallthrough
    //java 14
    int num = switch (i) {
        case 1, 2, 3 -> 10;
        case 4, 5, 6 -> 20;
        default -> 0;
    };
    IO.println("Case result: "+num);
    //with yield
    int numY = switch (i) {
        case 1, 2, 3 -> 10;
        case 4, 5, 6 -> 20;
        default -> {
            int result = i * 2;
            yield result;
        }
    };
    IO.println("Case with yield result: "+numY);

    //Falls through
    int numF = switch (i) {
        case 1:
            IO.println("Case 1");
        case 2:
            IO.println("Case 2");
        case 3:
            IO.println("Case 3");
            yield 10;
        default:
            throw new IllegalStateException("Unexpected value: " + i);
    };
    IO.println("Case with fallthrough result: "+numF);

    switch (i) {
        case 1:
            IO.println("Case 1");
            break;
        case 2:
            IO.println("Case 2");
        case 3:
            IO.println("Case 3");
            break;
        default:
            IO.println("Default");
    }
    IO.println("End of switch");

}
