package question3;

public class HollowPyramid {
    public String getHollowPyramid(int layers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= layers; i++){
            for (int j = 1; j <= 2 * layers - 1; j++){
                boolean isStar = (j == layers - i + 1)
                        || (j == layers + i - 1)
                        || (i == layers);
                sb.append(isStar ? "*" : " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

