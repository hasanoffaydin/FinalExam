package ChainRepeat;

public class Executive extends Approver{
    public Executive() {
        super(null);
    }

    @Override
    boolean check(int amount) {
        System.out.println("Executive problemi hell etdi :)");
        return true;
    }
}
