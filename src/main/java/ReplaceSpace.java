public class ReplaceSpace {

    public static void main(String[] args) {
        String product = "sol/active short";



        System.out.println(product + "\n"
                + product.replace("/", "-").replace(" ", "-"));
    }

}
