public class TicTacToe {
    public static void main(String[] args) {
        int[] throwsArray = new int[6];

        throwsArray[4] = 9;

        for (int i = 0; i < throwsArray.length; i++) {
            System.out.print(throwsArray[i] + " ");
        }
        int[][] playGround = new int[3][3];

        playGround[0][0] = 1;
        playGround[2][1] = 9;
        System.out.println("-------------");
        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + " ");

            }
            System.out.println();
        }
    }
}