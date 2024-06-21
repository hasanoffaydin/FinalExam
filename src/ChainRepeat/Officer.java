package ChainRepeat;

public class Officer extends Approver {
    public Officer(Approver chief) {
        super(chief);
    }

    @Override
    boolean check(int amount) {
        if (amount < 100) {
            System.out.println("Officer prorsesi heyata kecirdi :)");
            return true;
        } else if (chief != null) {
            System.out.println("Proses managere gonderildi :)");
            return chief.check(amount);
        }
        return false;
    }

}
