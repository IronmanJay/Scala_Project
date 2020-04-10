package DataStructure.Stack

import util.control.Breaks._

object Calculator {

  def main(args: Array[String]): Unit = {
    val expression = "30+4*6-2"
    val numStack = new ArrayStack2(10)
    val operStack = new ArrayStack2(10)
    // 循环的取出expression里面的内容
    var index = 0
    var num1 = 0
    var num2 = 0
    var oper = 0
    var res = 0
    var ch = ' '
    var keepNum = "" // 在进行扫描时，保存上次的数字ch，并进行拼接
    breakable {
      while (true) {
        // 扫面expression
        ch = expression.substring(index, index + 1)(0)
        if (operStack.isOper(ch)) { // 如果是操作符
          if (!operStack.isEmpty()) {
            if (operStack.priority(ch) <= operStack.priority(operStack.stack(operStack.top))) {
              // 开始计算
              num1 = numStack.pop().toString.toInt
              num2 = numStack.pop().toString.toInt
              oper = operStack.pop().toString.toInt
              res = numStack.cal(num1, num2, oper)
              // 入数栈
              numStack.push(res)
              // 把当前ch入符号栈
              operStack.push(ch)
            } else {
              // 如果当前的符号优先级大于符号栈顶的符号优先级，直接入栈
              operStack.push(ch)
            }
          } else {
            // 符号就直接入栈
            operStack.push(ch)
          }
        } else { // 是数字
          // 处理多位数逻辑
          keepNum += ch
          // 如果ch已经是expression的最后一个字符
          if (index == expression.length - 1) {
            numStack.push(keepNum.toInt)
          } else {
            // 判断ch的下一个字符是不是数字，如果是数字，则进行下一次扫描，如果是操作符，就直接入栈
            // 看espression的下一个字符时，不是要真正的移动index，只是探测一下
            if (operStack.isOper(expression.substring(index + 1, index + 2)(0))) { // 是操作符就入栈
              numStack.push(keepNum.toInt)
              keepNum = "" // 清空
            }
          }
        }
        // index后移
        index += 1
        // 判断是否到表达式的最后
        if (index >= expression.length) {
          break()
        }
      }
    }
    // 当整个表达式扫描完毕后，以此从数栈和符号栈取出数据，进行运算，最后在数栈中的数据就是结果
    breakable {
      while (true) {
        if (operStack.isEmpty()) {
          break()
        }
        // 开始计算
        num1 = numStack.pop().toString.toInt
        num2 = numStack.pop().toString.toInt
        oper = operStack.pop().toString.toInt
        res = numStack.cal(num1, num2, oper)
        numStack.push(res) // 入栈
      }
    }
    // 将数栈的最后结果pop
    val res2 = numStack.pop()
    printf("表达式%s=%d", expression, res2)
  }

}

// 栈
class ArrayStack2(size: Int) {
  val maxSize = size // 栈的大小
  var stack = new Array[Int](maxSize)
  // 栈顶，初始化为-1
  var top = -1

  // 栈满
  def isFull(): Boolean = {
    top == maxSize - 1
  }

  // 栈空
  def isEmpty(): Boolean = {
    top == -1
  }

  // 入栈
  def push(value: Int): Unit = {
    if (isFull()) {
      println("栈满")
      return
    }
    top += 1
    stack(top) = value
  }

  // 出栈
  def pop(): Any = {
    if (isEmpty()) {
      return new Exception("栈空")
    }
    val value = stack(top)
    top -= 1
    return value
  }

  // 遍历栈
  def list(): Unit = {
    if (isEmpty()) {
      println("栈空，没有数据")
      return
    }
    for (i <- 0 to top reverse) {
      printf("stack[%d]=%d\n", i, stack(i))
    }
  }

  // 返回运算符的优先级
  def priority(oper: Int): Int = {
    if (oper == '*' || oper == '/') {
      1
    } else if (oper == '+' || oper == '-') {
      0
    } else {
      -1
    }
  }

  // 判断是否是操作符
  def isOper(value: Int): Boolean = {
    value == '+' || value == '-' || value == '*' || value == '/'
  }

  // 计算的方法
  def cal(num1: Int, num2: Int, oper: Int): Int = {
    var res = 0
    oper match {
      case '+' => res = num1 + num2
      case '-' => res = num2 - num1
      case '*' => res = num1 * num2
      case '/' => res = num2 / num1
    }
    res
  }

}

