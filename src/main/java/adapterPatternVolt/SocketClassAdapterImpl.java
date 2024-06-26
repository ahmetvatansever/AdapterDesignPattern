package adapterPatternVolt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

    private Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40);
    }
}
