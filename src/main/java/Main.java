public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader();
        reader.scan();
        reader.i = count(reader.i);
        reader.k = count(reader.k);
        reader.scan(reader.i, reader.k);

    }

    private static int count(int x){
        x = x + 1;
        return x;
    }

}
