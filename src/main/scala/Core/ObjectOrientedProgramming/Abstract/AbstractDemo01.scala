package Core.ObjectOrientedProgramming.Abstract

import scala.beans.BeanProperty

object AbstractDemo01 {

  def main(args: Array[String]): Unit = {
    // 开卡
    val account = new Account("gh0001", 894.0, "111111")
    account.query("111111")
    account.withDraw("111111", 100.0)
    account.query("111111")
    account.setA(0)

    var test = new Test
    test.setName("赵越")
  }

}

class Test {
  @BeanProperty var name: String = ""
  @BeanProperty var age: Int = 0
}

// 编写一个Account类
class Account(inAccount: String, inBalance: Double, inPwd: String) {
  private val accountNo = inAccount
  private var balance = inBalance
  private var pwd = inPwd
  @BeanProperty var a = 0

  // 查询
  def query(pwd: String): Unit = {
    if (this.pwd != pwd) {
      println("密码错误")
      return
    }
    printf("账号为%s的当前余额为:%f", this.accountNo, this.balance)
  }

  // 取款
  def withDraw(pwd: String, money: Double): Any = {
    if (this.pwd != pwd) {
      println("密码错误")
      return
    }
    // 判断money是否合理
    if (money > this.balance) {
      println("余额不足")
      return
    }
    this.balance -= money
  }
}
