public class BridgeDemo {

    public static void main(String[] args) {

        Device tv = new Tv();

        BasicRemote basicTvRemote = new BasicRemote(tv);
        basicTvRemote.power();
        basicTvRemote.chanelUp();
        basicTvRemote.volumeDown();
        tv.printStatus();

        Device radio = new Radio();

        BasicRemote basicRadioRemote = new BasicRemote(radio);
        basicRadioRemote.power();
        basicRadioRemote.volumeDown();
        radio.printStatus();

        AdvanceRemote advanceRemote = new AdvanceRemote(radio);
        advanceRemote.mute();
        advanceRemote.power();
        radio.printStatus();
    }
}
