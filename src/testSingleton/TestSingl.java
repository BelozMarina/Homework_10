package testSingleton;

public class TestSingl {
    private static TestSingl instance;

    public static TestSingl getInstance() {
        if (instance == null) {
            instance = new TestSingl();
        }
        return instance;
    }

    private TestSingl () {
    }

    public void print() {
        System.out.println(this);
    }
}
