import Context.*;

public class Main {
    public static void main(String[] args) {
        Context context = new ContextSub1();
        context.Test1();
        context.Diff();
        context = new ContextSub2();
        context.Test1();
        context.Diff();
    }
}