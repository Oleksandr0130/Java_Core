package lesson_08;

public class AddBracketsTransformer extends Transformer {
    @Override
    public String transform(String str) {
        str = "[" + str + "]";
        return str;
    }
}
