package lang.print.gaps.task5;

public class NumberDivider {
    void divide(float toBeDivided) {
        float result = toBeDivided / 5;
        System.out.println(result);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        float numberToBeDivided = 20;
        divider.divide(numberToBeDivided);
    }
}















