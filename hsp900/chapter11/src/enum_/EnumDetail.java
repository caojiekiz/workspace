package enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}
class A {

}
interface IPlaying {
    void playing();
}
enum Music implements IPlaying {
    CLASSICMUSIC;

    @Override
    public void playing() {
        System.out.println("播放音乐...");
    }
}