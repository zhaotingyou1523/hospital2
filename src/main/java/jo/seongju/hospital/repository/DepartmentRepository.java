package jo.seongju.hospital.repository;

import jo.seongju.hospital.domain.Department;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DepartmentRepository {

    private long id = 1L;// 线程安全

    private Map<Long, Department> departments = new HashMap<>();

    public synchronized Department insert(String name) {

        long departmentId = id++;
        Department department = new Department();
        department.setId(departmentId);
        department.setName(name);
        departments.put(department.getId(), department);

        return department;
    }

    public Department update(Long id, String name) {
        Department department = departments.get(id);
        department.setName(name);

        return department;
    }

    public Department delete(Long id) {
        return departments.remove(id);
    }

    public boolean exist(String name) {

        return departments.values().stream().anyMatch(department -> name.equals(department.getName()));
    }
}
