package jo.seongju.hospital;

import java.util.Scanner;

public class MainClient {

    private final Scanner sc = new Scanner(System.in);

    DepartmentClient departmentClient = new DepartmentClient(sc);

    public void start() {
        while (true) {
            System.out.println("=====欢迎进入仁爱医院信息管理系统=====");
            System.out.println("1、科室管理-添加科室");
            System.out.println("2、科室管理-删除科室");
            System.out.println("3、科室管理-修改科室");
            /*System.out.println("4、医生管理-录入医生");
            System.out.println("5、医生管理-医生坐诊设置（可设置当天和未来六天的坐诊情况");
            System.out.println("6、医生管理-展示全部医生的坐诊详情（当前和未来6天的坐诊详情）");
            System.out.println("7、医生管理-挂号预约");
            System.out.println("8、搜索某个医生当前和未来6天内病人预约详情（展示每天预约病人的具体信息·）");*/
            System.out.println("9、退出");
            System.out.println("请输入操作命令：");
            switch (sc.next()) {
                case "1":
                    departmentClient.addDepartment();
                    break;
                case "2":
                    departmentClient.deleteDepartment();
                    break;
                case "3":
                    departmentClient.changeDepartment();
                    break;
                /*case "4":
                    addDoctor();
                    break;
                case "5":
                    setDoctorJob();//难点
                    break;
                case "6":
                    showAllDoctorInfos();//难点
                    break;
                case "7":
                    appointmentRegistration();
                    break;
                case "8":
                    serch();
                    break;*/
                case "9":
                    System.out.println("Terminate");
                    System.exit(1);
                    break;
                default:
                    System.out.println("当前命令输入有误，请重新输入！");
            }
        }
    }
}
