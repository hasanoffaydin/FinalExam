package ChainRepeat;

public abstract class Approver {
    Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean check(int amount);

}
