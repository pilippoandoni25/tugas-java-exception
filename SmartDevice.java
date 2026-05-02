public abstract class SmartDevice {
    protected String ipAddress;

    // Constructor untuk menset ipAddress
    public SmartDevice(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    // Abstract method: kontrak yang wajib diimplementasikan subclass
    public abstract void turnOn();
}