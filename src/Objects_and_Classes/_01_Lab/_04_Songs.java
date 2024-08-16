package Objects_and_Classes._01_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Songs {

    public static class Song {

        // fields
        private String typeSong;
        private String nameOfSong;
        private String timeOfSong;

        public String getTypeSong() {
            return typeSong;
        }

        public void setTypeSong(String typeSong) {
            this.typeSong = typeSong;
        }

        public String getNameOfSong() {
            return nameOfSong;
        }

        public void setNameOfSong(String nameOfSong) {
            this.nameOfSong = nameOfSong;
        }

        public String getTimeOfSong() {
            return timeOfSong;
        }

        public void setTimeOfSong(String timeOfSong) {
            this.timeOfSong = timeOfSong;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numSongs = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();

        String command = scan.nextLine();
        while (!command.equals("all") && command.contains("_")) {
            String[] instructions = command.split("_");
            Song song = new Song();
            song.setTypeSong(instructions[0]);
            song.setNameOfSong(instructions[1]);
            song.setTimeOfSong(instructions[2]);
            songs.add(song);

            command = scan.nextLine();
        }

        if (command.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getNameOfSong());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeSong().equals(command)) {
                    System.out.println(song.getNameOfSong());
                }
            }
        }
    }
}
