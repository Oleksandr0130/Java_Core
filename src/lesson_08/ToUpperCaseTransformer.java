package lesson_08;

public class ToUpperCaseTransformer extends Transformer {
    @Override
    String transform(String str) {
        return  str.toUpperCase();
    }
}
