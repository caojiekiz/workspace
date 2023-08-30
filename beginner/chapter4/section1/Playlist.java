package beginner.chapter4.section1;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist =
                new ArrayList<String>();
        desertIslandPlaylist.add("111");
        desertIslandPlaylist.add("222");
        desertIslandPlaylist.add("333A");
        desertIslandPlaylist.add("444");
        desertIslandPlaylist.add("555B");
        desertIslandPlaylist.add("666");
        desertIslandPlaylist.add("777");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(3);
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        int indexA = desertIslandPlaylist.indexOf("333A");
        int indexB = desertIslandPlaylist.indexOf("555B");
        String tempA = desertIslandPlaylist.get(indexA);
        desertIslandPlaylist.set(indexA,"555B");
        desertIslandPlaylist.set(indexB,tempA);
        System.out.println(desertIslandPlaylist);
    }

}
