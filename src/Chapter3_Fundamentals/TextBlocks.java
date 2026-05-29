void main() {
    String textBlock = """
            <html>
                <body>
                    <p>Hello World</p>
                </body>
            </html>
            This is a text block.
            It can span multiple lines.\\
            It preserves the formatting and indentation.
            """;
    IO.println(textBlock);
}
