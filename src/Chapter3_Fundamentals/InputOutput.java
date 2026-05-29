void main() {
    //Java 25
//    String name = IO.readln("What is your name?: ");
//    int age = Integer.parseInt(IO.readln("What is your age?: "));
//    IO.println("Hello " + name);
//    IO.println("Your age is " + age);

    //Older java versions java 5
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Whats your name?");
//    String name2 = sc.nextLine();
//    System.out.println("Hello " + name2);
//    System.out.println("Whats your age?");
//    int age = sc.nextInt();
//    System.out.println("Your age is " + age);

    //java 1 and 6
    Console console = System.console();
    String userName;
    char[] password;

    if (console != null) {
        userName = console.readLine("What is your name?: ");
        password = console.readPassword("What is your password?: ");
    } else {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("What is your name? t: ");
        userName = sc.nextLine();
        System.out.print("What is your password? t: ");
        password = sc.nextLine().toCharArray();
    }

    Arrays.fill(password, '*');
    System.out.println("Hello " + userName);
    System.out.println("Your password is " + new String(password));
}
