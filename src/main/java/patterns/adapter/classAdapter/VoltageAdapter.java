package patterns.adapter.classAdapter;
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dstV = src/44;
        return dstV;
    }
}
