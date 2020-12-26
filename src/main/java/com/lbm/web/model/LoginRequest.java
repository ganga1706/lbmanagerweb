package com.lbm.web.model;

public class LoginRequest {

  private String userName;
  private String password;

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("LoginRequest [userName=");
    builder.append(userName);
    builder.append(", password=");
    builder.append(password);
    builder.append("]");
    return builder.toString();
  }

}
