public class CharacterPatternOne {
    public void characterPatternOne() {
        int alphabet = 65;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(alphabet + j)+" ");
            }
            System.out.println();
        }
    }
}
