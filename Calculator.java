public class Calculator {
    private int result = 0;

    public void plus(int a, int b) {
        result = a + b;
    }

    public void minus(int a, int b) {
        result = a - b;
    }

    public void divide(int a, int b) {
        if (b == 0) {
            result = 0;
            System.out.println("0으로 나눌 수 없습니다");
        } else {
            result = a / b;
        }
    }

    public void multiple(int a, int b) {
        result = a * b;
    }

    public void printResult() {
        System.out.println(result);
    }
}
