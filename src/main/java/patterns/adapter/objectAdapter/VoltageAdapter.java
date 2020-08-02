package patterns.adapter.objectAdapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage;

    public VoltageAdapter(Voltage220V voltage) {
        this.voltage = voltage;
    }

    @Override
    public int output5V() {
        int dstV = 0;
       if (null != voltage){
           int src = voltage.output220V();
           dstV = src/44;
       }
        return dstV;
    }
}
