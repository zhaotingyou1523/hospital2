package jo.seongju.hospital.service;

import jo.seongju.hospital.domain.Department;
import jo.seongju.hospital.repository.DepartmentRepository;

public class DepartmentService {

    private DoctorService doctorService = new DoctorService();

    private DepartmentRepository repository = new DepartmentRepository();

    public boolean hasName(String name) {
        return repository.exist(name);
    }

    public Department addDepartment(String name) {

        Department department = repository.insert(name);

        return department;
    }

    public Department updateDepartment(Long id, String name) {

        return repository.update(id, name);
    }

    public Department delete(Long id) {

        return repository.delete(id);
    }

}
