package ChainRepeat;

import Chain.Chain;

public class Main {
    public static void main(String[] args) {
        Approver executive = new Executive();
        Approver manager = new Manager(executive);
        Approver officer = new Officer(manager);

        officer.check(1500);
    }
}
