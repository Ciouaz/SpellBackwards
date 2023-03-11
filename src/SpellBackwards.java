public class SpellBackwards {
    String word;
    SpellBackwards(String word) {
        this.word = word;
        for (int i = word.length(); i >= 1; i--){
            System.out.print(word.charAt(i - 1));
        }
        System.out.print("\n");
    }

}
