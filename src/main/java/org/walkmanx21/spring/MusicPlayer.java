package org.walkmanx21.spring;

import com.sun.source.tree.BinaryTree;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer (Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList() {
        musicList.forEach(music -> System.out.println(music.getSong()));
    }



}
