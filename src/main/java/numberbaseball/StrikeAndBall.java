package numberbaseball;

public class StrikeAndBall {


  int strike = 0;
  int ball = 0;
  String answer;
  boolean perfect = false;

  public String check() {
    if (strike == 3) {
      perfect = true;
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
    return answer;
  }

}
