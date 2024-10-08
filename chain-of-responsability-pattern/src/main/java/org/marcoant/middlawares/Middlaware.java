package org.marcoant.middlawares;

public abstract class Middlaware {
  private Middlaware next;

  public Middlaware linkWith(Middlaware next) {
    this.next = next;
    return  next;
  }

  public abstract boolean check(String email, String password);

  protected boolean checkNext(String email, String password) {
    if (next == null) {
      return true;
    }
    return  next.check(email, password);
  }
}
