import java.util.Scanner;

public class BrainfuckInterpreter extends BrainfuckBaseVisitor<Conf> {

    private static final Scanner console = new Scanner(System.in);

    private final Conf conf;

    public BrainfuckInterpreter(Conf conf) {
        this.conf = conf;
    }

    @Override
    public Conf visitMain(BrainfuckParser.MainContext ctx) {
        return visit(ctx.com());
    }

    @Override
    public Conf visitLt(BrainfuckParser.LtContext ctx) {
        conf.left();
        return visit(ctx.com());
    }

    @Override
    public Conf visitGt(BrainfuckParser.GtContext ctx) {
        conf.right();
        return visit(ctx.com());
    }

    @Override
    public Conf visitPlus(BrainfuckParser.PlusContext ctx) {
        conf.inc();
        return visit(ctx.com());
    }

    @Override
    public Conf visitMinus(BrainfuckParser.MinusContext ctx) {
        conf.dec();
        return visit(ctx.com());
    }

    @Override
    public Conf visitLoop(BrainfuckParser.LoopContext ctx) {
        if (conf.get() == 0)
            return visit(ctx.com(1));

        visit(ctx.com(0));

        return visit(ctx);
    }

    @Override
    public Conf visitDot(BrainfuckParser.DotContext ctx) {
        System.out.println(conf.get());
        return visit(ctx.com());
    }

    @Override
    public Conf visitComma(BrainfuckParser.CommaContext ctx) {
        System.out.print(":> ");
        int x = console.nextInt();
        conf.update(x);

        return visit(ctx.com());
    }

    @Override
    public Conf visitNil(BrainfuckParser.NilContext ctx) {
        return conf;
    }
}
