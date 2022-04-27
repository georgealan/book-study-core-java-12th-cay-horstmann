package Operators;

/**
 * If you need to choose among more than two values, then you can use a switch expression.
 *
 * A switch expression with a integer or String must aways have a default since it must yield a value, no matter what
 * the operand value is, if the operand is null, a NullPointerException is trhrow.
 */

public class SwitchExpressions {
    public static void main(String[] args) {

        byte seasonCode = 0;
        enum Size { EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE};
        Size itemSize = Size.SMALL;

        String seasonName = switch (seasonCode){
            case 0, 10, 15, 20 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "???";
        };

        String label = switch (itemSize){
            case EXTRA_SMALL, SMALL -> "S";
            case MEDIUM -> "M";
            case LARGE -> "L";
            case EXTRA_LARGE -> "XL";
        };

        System.out.println(seasonName);
        System.out.println(label);

    }
}
