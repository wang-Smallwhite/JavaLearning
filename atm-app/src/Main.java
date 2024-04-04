import com.learning.atm.Account;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 创建用户表，方便存储用户信息
    ArrayList<Account> accounts = new ArrayList<>();
    // 显示系统欢迎页面
    System.out.println("===================欢迎进入ATM系统======================");
    while (true) {
      System.out.println("1、登陆系统");
      System.out.println("2、注册用户");
      System.out.println("请你选择操作：");
      Scanner sc = new Scanner(System.in);
      int command = sc.nextInt();
      switch(command) {
        case 1:
          login(accounts, sc);
          break;
        case 2:
          register(accounts, sc);
          break;
        default:
          System.out.println("输入指令错误！");
      }
    }

  }

  // 登陆系统
  public static void login(ArrayList<Account> accounts, Scanner sc) {
    System.out.println("==============系统登陆================");
    if(accounts.size() == 0) {
      System.out.println("当前系统无任何用户，请您先注册再登陆！");
      return;
    }else {
      while (true) {
        System.out.println("请输入您的银号卡号：");
        String id = sc.next();
        // 判断列表中是否有当前卡号
        Account user = getAccountById(accounts, id);
        if(user == null) {
          System.out.println("您输入的银行卡号不存在！");
        }else {
          while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            if(user.getPassword().equals(password)) {
              // 密码正确
              System.out.println("恭喜您：" + user.getName() + "先生/女士进入系统， 您的卡号是：" + user.getNumNo());

              // 展示操作页面
              showUserCommand(accounts,user,sc);

              break;
            }else {
              System.out.println("输入密码错误！请重新输入！！");
            }
          }
          break;
        }
      }


    }
  }

  // 注册用户
  public static void register(ArrayList<Account> accounts, Scanner sc) {
    Account account = new Account();
    while (true) {
      System.out.println("=============系统开户===============");
      System.out.println("请您输入账户名称：");
      String name = sc.next();
      account.setName(name);
      System.out.println("请您输入账户密码：");
      String password = sc.next();
      System.out.println("请您输入确认密码：");
      String passwordSecond = sc.next();
      if(!password.equals(passwordSecond)) {
        System.out.println("两次输入的密码不一致！");
      }else {
        account.setPassword(password);
        break;
      }
    }
      System.out.println("请您输入账户限额：");
      double limit = sc.nextDouble();
      account.setLimit(limit);
      // 生成卡号
      String numNo = getNumNo(accounts);
      account.setNumNo(numNo);
      accounts.add(account);
      System.out.println("恭喜您开户成功！您的银行卡号是：" + account.getNumNo());

  }

  // 随机生成卡号且
  public static String getNumNo(ArrayList<Account> accounts) {
    int len = accounts.size() + 1;
    String num = String.format("%08d", len); // 使用String.format来格式化数字，确保其至少为4位数，不足部分用0填充
    return num;
  }

  // 查询卡号是否在列表中
  public static Account getAccountById(ArrayList<Account> accounts, String id) {
    for (Account user : accounts) {
      if (user.getNumNo().equals(id)) {
        return user;
      }
    }
    return null;
  }


  public static void showUserCommand(ArrayList<Account> accounts, Account user, Scanner sc) {
    while (true) {
      System.out.println("==================用户操作页面======================");
      System.out.println("1、查询账户");
      System.out.println("2、存款");
      System.out.println("3、取款");
      System.out.println("4、转账");
      System.out.println("5、修改密码");
      System.out.println("6、退出");
      System.out.println("7、注销账户");
      System.out.println("请你选择操作项：");
      int command = sc.nextInt();
      switch(command) {
        case 1:
          queryUser(user);
          break;
        case 2:
          deposit(user, sc);
          break;
        case 3:
          withdrawal(user, sc);
          break;
        case 4:
          transfer(accounts, user, sc);
          break;
        case 5:
          modifyPassWord(user, sc);
          break;
        case 6:
//          exitProgram();
          return;
        case 7:
          if(removeAcc(accounts, user, sc)) {
            return;
          }else {
            break;
          }
        default:
          System.out.println("输入操作无效！！！");
      }
    }
  }

  private static Boolean removeAcc(ArrayList<Account> accounts,Account user, Scanner sc) {
    System.out.println("================注销操作================");
    System.out.println("您真的要销户吗？ y/n");
    String rs = sc.next();
    switch (rs) {
      case "y":
        if(user.getMoney() > 0) {
          System.out.println("当前账户还有余额，请取出在进行销户");
          return false;
        }else {
          accounts.remove(user);
          System.out.println("注销账户成功");
          return true;
        }
      case "n":
        System.out.println("已经取消！！！");
        return false;
      default:
        System.out.println("输入指令不正确！！！");
        return false;
    }
  }

  // 修改密码
  private static void modifyPassWord(Account user, Scanner sc) {
    System.out.println("================修改密码操作================");
    while (true) {
      System.out.println("请输入旧密码");
      String oldPassWord = sc.next();
      if(user.getPassword().equals(oldPassWord)) {
        while (true) {
          System.out.println("请输入新密码");
          String newPassWord = sc.next();
          System.out.println("请输入确认密码");
          String newPassWordSecond = sc.next();
          if(newPassWord.equals(newPassWordSecond)) {
            user.setPassword(newPassWord);
            System.out.println("修改密码成功！！！");
            break;
          }else {
            System.out.println("两次密码输入不一致!!!");
          }
        }
        break;
      }else {
        System.out.println("旧密码错误！！！");
      }
    }

  }


  // 查询账户
  public static void queryUser(Account user) {
    System.out.println("==================用户信息==================");
    System.out.println("银行卡号：" + user.getNumNo());
    System.out.println("姓名：" + user.getName());
    System.out.println("存款：" + user.getMoney());
    System.out.println("每次限额：" + user.getLimit());
  }

  // 存款
  public static void deposit(Account user, Scanner sc) {
    System.out.println("==================存款==================");
    System.out.println("请输入存款：");
    double money = sc.nextDouble();
    user.setMoney(money);
    System.out.println("成功充入" + money + "元，当前账户余额：" + user.getMoney() + "元。");
  }

  // 取款
  public static void withdrawal(Account user, Scanner sc) {
    while (true) {
      System.out.println("==================取款==================");
      System.out.println("请输入取款：");
      double money = sc.nextDouble();
      if(user.getLimit() < money) {
        System.out.println("当前取款数额超过了限额！！");
      } else if (user.getMoney() < money) {
        System.out.println("当前账户金额不足，请重新输入");
      } else if(user.getMoney() == 0) {
        System.out.println("没钱就不要取款了！！！");
        break;
      } else {
        double newMoney = user.getMoney() - money;
        user.setMoney(newMoney);
        System.out.println("您取出"+ money +"元，当前账户余额：" + user.getMoney() + "元");
        break;
      }
    }
  }

  // 转账
  public static void transfer(ArrayList<Account> accounts, Account user, Scanner sc) {
    System.out.println("==================转账==================");
    if(user.getMoney() == 0) {
      System.out.println("当前账户余额是0！！！");
      return;
    }
    while (true) {
      System.out.println("请输入转账银行卡号：");
      String cardId = sc.next();
      Account collectionUser = getAccountById(accounts, cardId);
      if(collectionUser != null) {
        System.out.println("请确认转账用户名称（" +  encryptionName(collectionUser.getName()) + "）：");
        String surname = sc.next();
        if(collectionUser.getName().startsWith(surname)) {
          while (true) {
            System.out.println("请输入转款金额：");
            double money = sc.nextDouble();
            if(user.getLimit() < money) {
              System.out.println("当前转账数额超过了限额！！");
            } else if (user.getMoney() < money) {
              System.out.println("当前账户金额不足，请重新输入");
            } else if(user.getMoney() == 0) {
              System.out.println("没钱就不要皮！！！");
              break;
            } else {
              double newMoney = user.getMoney() - money;
              user.setMoney(newMoney);
              collectionUser.setMoney(collectionUser.getMoney() + money);
              System.out.println("您转出"+ money +"元，当前账户余额：" + user.getMoney() + "元");
              break;
            }
          }
          break;
        }else {
          System.out.println("收款人姓名错误！！");
        }
      }else{
        System.out.println("系统中并没有当前账号，请检查！");
      }
    }
  }

  // 名字替换
  public static String encryptionName(String name) {
    return name.replace(name.substring(0, 1), "*");
  }
}
