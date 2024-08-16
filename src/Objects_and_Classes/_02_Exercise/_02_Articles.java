package Objects_and_Classes._02_Exercise;

import java.util.Scanner;

public class _02_Articles {

    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            String toPrint = title + " - " + content + ": " + author;
            return toPrint;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] instruction = scan.nextLine().split(", ");
        String title = instruction[0];
        String content = instruction[1];
        String author = instruction[2];
        Article article = new Article(title, content, author);

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= number; i++) {
            String[] nextInstruction = scan.nextLine().split(": ");
            String key = nextInstruction[0];
            String value = nextInstruction[1];

            if (key.equals("Edit")) {
                article.setContent(value);
            } else if (key.equals("ChangeAuthor")) {
                article.setAuthor(value);
            } else if (key.equals("Rename")) {
                article.setTitle(value);
            }
        }


        System.out.println(article);

    }
}
