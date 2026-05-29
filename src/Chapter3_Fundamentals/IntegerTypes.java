void main() {
    byte b1 = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;

    /**
     * byte: 8 bits, range -128 to 127
     */
    byte b2 = 10;
    IO.println((byte) (b1 + b2)); // -128 (overflow)

    //Short: 16 bits, range -32768 to 32767
    short s2 = 10;
    IO.println((short) (s + s2)); // -32768 (overflow)

    //Integer: 32 bits, range -2147483648 to 2147483647
    int i2 = 10;
    IO.println(i + i2); // -2147483648 (overflow)

    //Long: 64 bits, range -9223372036854775808 to 9223372036854775807
    long l2 = 10555555555L;
    IO.println(l + l2); // -9223372036854775808 (overflow)
}