public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1, 2);
        System.out.println("1 + 2 = " + result);
        try {
            result = proxy.add(2, Double.MAX_VALUE);
            System.out.println("2 + Double.MAX_VALUE = " + result);//Should throw exception
        } catch (Exception e) {
            System.out.println("Truong trinh gap loi");
        }
        result = proxy.add(3, 4);
        System.out.println("3 + 4 = " + result);
    }
}
