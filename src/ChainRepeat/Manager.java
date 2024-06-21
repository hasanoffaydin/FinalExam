package ChainRepeat;

public class Manager extends Approver{
    public Manager(Approver chief) {
        super(chief);
    }

    @Override
    boolean check(int amount) {
        if(amount < 500) {
            System.out.println("Manager prosesi hell etdi :)");
            return true;
        } else if(chief != null) {
            System.out.println("Proses executive gonderildi :)");
            return chief.check(amount);
        }
        return false;
    }
}
