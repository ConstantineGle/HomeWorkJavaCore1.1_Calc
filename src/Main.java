public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); //строка не работает т.к. происходит деление на ноль (ArithmeticException: / by zero)

        int d = calc.multiply.apply(4, 5);
        int e = calc.abs.apply(-6);

        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);

    }
}

@FunctionalInterface
interface Supplier<C> {
    Calculator get();
}
