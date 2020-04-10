package Core.AdvancedFeatures.Task

object BankAccount {
  def main(args: Array[String]): Unit = {
//    val checkingAccount = new CheckingAccount(100)
//    checkingAccount.query()
//    checkingAccount.deposit(10)
//    checkingAccount.query()
//    checkingAccount.withdraw(10)
//    checkingAccount.query()
    val savingsAccount = new SavingsAccount(100)
    savingsAccount.query()
    savingsAccount.earnMonthInterest()
    savingsAccount.withdraw(10)
    savingsAccount.withdraw(10)
    savingsAccount.withdraw(10)
    savingsAccount.query()
    savingsAccount.withdraw(10)
    savingsAccount.query()
  }
}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double): Unit = {
    balance += amount
    balance
  }

  def withdraw(amount: Double): Unit = {
    balance -= amount
    balance
  }

  def query(): Unit = {
    println("当前余额为:" + this.balance)
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  override def deposit(amount: Double): Unit = super.deposit(amount - 1)

  override def withdraw(amount: Double): Unit = super.withdraw(amount + 1)
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var num: Int = _

  def earnMonthInterest(): Unit = {
    num = 3
    super.deposit(1)
  }

  override def deposit(amount: Double): Unit = {
    num -= 1
    if (num < 0) {
      super.deposit(amount - 1)
    } else {
      super.deposit(amount)
    }
  }

  override def withdraw(amount: Double): Unit = {
    num -= 1
    if (num < 0) {
      super.withdraw(amount + 1)
    } else {
      super.withdraw(amount)
    }
  }
}
