package numberbaseball;

public class ResultPrinter {
  private int strike;
  private int ball;

  public ResultPrinter(int strike, int ball) {
    this.strike = strike;
    this.ball = ball;
  }

  public void print(){
    String answer;
    if (strike == 3) {
      answer = "정답입니다.";
    } else if (ball == 0 & strike == 0) {
      answer = "낫싱";
    } else {
      if (ball == 0) {
        answer = strike + "스트라이크";
      } else if (strike == 0) {
        answer = ball + "볼";
      } else {
        answer = strike + "스트라이크" + ball + "볼";
      }
    }
    System.out.println(answer);
  }
}
