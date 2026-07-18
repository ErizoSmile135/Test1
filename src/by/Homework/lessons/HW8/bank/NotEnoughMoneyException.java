package by.Homework.lessons.HW8.bank;

public class NotEnoughMoneyException extends RuntimeException {
  private String errorCode;

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public NotEnoughMoneyException(String message) {
        super(message);
    }
}
