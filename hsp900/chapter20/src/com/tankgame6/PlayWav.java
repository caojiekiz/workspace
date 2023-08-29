package com.tankgame6;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class PlayWav extends Thread {
    private String wavFilePath;

    public PlayWav(String wavFilePath) {
        this.wavFilePath = wavFilePath;
    }

    @Override
    public void run() {
        try {
            // WAVファイルを開く
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(wavFilePath));

            // Clipを取得して再生する
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // 再生が終わるまで待つ
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // クリップを閉じる
            clip.close();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
