public class intExp extends intExpBaseVisitor<Integer> {

    @Override
    public Integer visitMain(intExpParser.MainContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Integer visitPlus(intExpParser.PlusContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left + right;
    }

    @Override
    public Integer visitMul(intExpParser.MulContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left * right;
    }

    @Override
    public Integer visitNat(intExpParser.NatContext ctx) {
        return Integer.parseInt(ctx.NAT().getText());
    }
}
