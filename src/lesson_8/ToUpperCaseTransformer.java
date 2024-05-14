package lesson_8;

public class ToUpperCaseTransformer extends Transformer {
    @Override
    String transform(String str) {
        return  str.toUpperCase();
    }
}
