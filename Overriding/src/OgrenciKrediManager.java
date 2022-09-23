public class OgrenciKrediManager extends BaseKrediManager{

    public @Override double hesapla(double tutar){  //final(ezmeyi engeller)
        return tutar*1.10;
    }
}
