package adapter;

public class OldSystemAdapter implements NewSystem{
	private OldSystem oldSystem;

    public OldSystemAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void doSomethingNew() {
        oldSystem.doSomethingOld();
    }
}
