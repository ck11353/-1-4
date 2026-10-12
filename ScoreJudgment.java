package question3;

public class ScoreJudgment {
    public String judgeif(int score) {
        if (score > 100 ) {
            return "输入错误";
        } else if (score >= 90 ) {
            return "成绩评定（if-else）:A";
        } else if (score >= 80) {
            return "成绩评定（if-else）:B";
        } else if (score >= 70) {
            return "成绩评定（if-else）:C";
        } else if (score >= 60) {
            return "成绩评定（if-else）:D";
        } else if (score >= 0){
            return "成绩评定（if-else）:E";
        }else return "输入错误";
    }
    public String judgeswitch(int score) {
        if (score > 100 || score < 0)
            return "输入错误";
        switch (score / 10) {
            case 10:
            case 9:
                return "成绩评定（switch）:A";
            case 8:
                return "成绩评定（switch）:B";
            case 7:
                return "成绩评定（switch）:C";
            case 6:
                return "成绩评定（switch）:D";
            default: return "成绩评定（switch）:E";
        }
    }
}
