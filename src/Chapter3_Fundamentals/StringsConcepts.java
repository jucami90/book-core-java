void main() {
        String a =  null;
        String b = "   World     ";
        String c = a + " " + b;
        IO.println(c);

        //a.compareTo(b); // returns a negative number because "Hello" is less than "World"

        IO.println(a == null || a.isBlank());
        //IO.println(a.isEmpty());

        IO.println(b.indexOf("o")); // returns 1
        IO.println(b.indexOf("o", 0)); // returns 6
        IO.println(b.indexOf("r", 0, 4));

        IO.println(b.length() + b.strip() + b.length());
        IO.println(b.stripLeading());
        IO.println(b.stripTrailing());

        IO.println(b.join("/", "Hello", "World","3"));

        IO.println(b.repeat(3));

        StringBuilder sb = new StringBuilder();
        StringBuilder ssb = new StringBuilder("INVOICE\n");
        sb.append(ssb);
        sb.append("123456789\n");
        IO.println(sb);

        sb.appendCodePoint(65);
        IO.println(sb);

        final int RENGIONAL_INDICATOR_SYMBOL_LETTER_A = 0x1F1E6;
        String country = "\uD83C\uDDFA";
        sb.appendCodePoint(country.charAt(0)-'A'+ RENGIONAL_INDICATOR_SYMBOL_LETTER_A);

        IO.println(sb);

        String complete = sb.toString();
        IO.println(complete);

        String completeAppend = new StringBuilder(sb)
                .append("\nHello")
                .append("\nWorld")
                .append(123456789)
                .appendCodePoint(65)
                .toString();
        IO.println(completeAppend+"\n");

        // Reversed surrogate pairs: StringBuilder.reverse() fixes malformed surrogate pairs
        String malformed = "\uDC00\uD800"; // low surrogate before high surrogate (malformed)
        String reversed = new StringBuilder(malformed).reverse().toString();
        IO.println("Malformed length: " + malformed.length()); // 2 code units
        IO.println("Reversed: " + reversed); // now valid surrogate pair \uD800\uDC00 → 𐀀
        IO.println("Reversed codepoint: " + reversed.codePointAt(0)); // 65536 = U+10000
        IO.println("Is valid surrogate pair: " + Character.isSurrogatePair(reversed.charAt(0), reversed.charAt(1)));

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.delete(0, 2);
        IO.println(sb2);
        sb2.insert(0, "HA");
        IO.println(sb2);
        sb2.repeat(65,15);
        IO.println(sb2);
    }

