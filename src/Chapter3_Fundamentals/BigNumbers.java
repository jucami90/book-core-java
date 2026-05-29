void main() {
    BigInteger a = BigInteger.valueOf(100);
    IO.println(a);
    BigInteger b = new BigInteger("21838127382743982749283742897");
    IO.println(b);

    //I cant use mathemathical operators like a Integer, Use methods
    BigInteger c = a.add(b);
    a.subtract(b);
    IO.println(c);
    IO.println(a.multiply(b));
}
