package jo.seongju.hospital;

import jo.seongju.hospital.service.DepartmentService;

import java.util.Scanner;

public class DepartmentClient {

    private DepartmentService departmentService = new DepartmentService();
    private Scanner sc;

    public DepartmentClient(Scanner sc) {
        this.sc = sc;
    }

    public void addDepartment() {

        System.out.println("========添加科室========");
        OUT:
        while (true){
            System.out.println("请输入科室名称：");
            String name = sc.next();
            // 判断名称是否存在
            if (departmentService.hasName(name)) {
                System.out.println("您输入的科室已存在，请重新输入");
                continue OUT;
            }

            departmentService.addDepartment(name);
            System.out.println("添加科室成功");
            break ;
        }
    }

    public void deleteDepartment() {

    }

    public void changeDepartment() {

    }
}
