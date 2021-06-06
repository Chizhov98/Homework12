public class CallOfException {
    public static void main(String[] args) {
        //classCastExceptionExample();
        //npeExample();
        //numberFormatExceptionExample();
        indexOutOfBoundsExceptionExample();
    }

    // unchecked
    public static void classCastExceptionExample() {
        Object intObj = new Integer(0);
        System.out.println((String) intObj);
    }

    // unchecked
    public static void npeExample() {
        System.out.println(new Demo().read(null));
    }

    // можно исспользовать try/catch но как по мне незачем, так как легче сделать валидацию входных данных(саммому, или на уровне фронта)
    public static void numberFormatExceptionExample() {
        String string = "2fail";
        int number = Integer.parseInt(string);
        System.out.println(number);
    }

    // unchecked
    public static void indexOutOfBoundsExceptionExample() {
        int[] array = new int[2];
        System.out.println(array[3]);
    }
}
