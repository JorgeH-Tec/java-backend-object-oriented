public interface Publication {
    public abstract void toOpen();

    public abstract void toClose();

    public abstract void browse(int page);

    public abstract void advancePage();

    public abstract void backPage();
}
