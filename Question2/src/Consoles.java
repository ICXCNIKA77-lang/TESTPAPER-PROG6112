public abstract class Consoles implements IConsoles {
    String ConsoleType;
    String Store;
    int TotalSales;

    public Consoles (String ConsoleType, String Store, int TotalSales) {
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales;
    }

    @Override
    public String getConsoleType() {
        return ConsoleType;
    }

    @Override
    public String getStore() {
        return Store;
    }

    @Override
    public int getTotalSales() {
        return TotalSales;
    }


}
