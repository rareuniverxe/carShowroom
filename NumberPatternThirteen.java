public class NumberPatternThirteen {
    public void numberPatternThirteen() {
        for (int i = 10; i > 1; i--) {
            int num=1;
            for (int j = 1; j < i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
