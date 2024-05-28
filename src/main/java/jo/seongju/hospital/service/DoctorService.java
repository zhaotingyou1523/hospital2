package jo.seongju.hospital.service;

import jo.seongju.hospital.domain.Doctor;
import jo.seongju.hospital.domain.Gender;
import jo.seongju.hospital.repository.DoctorRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class DoctorService {

    private DoctorRepository repository = new DoctorRepository();

    public Doctor addDoctor(String name, Gender gender, LocalDate birthYear, LocalDate joinDate) {
        Doctor doctor = new Doctor();
        doctor.setId(UUID.randomUUID().toString());
        doctor.setName(name);
        doctor.setGender(gender);
        doctor.setBirthYear(birthYear);
        doctor.setJoinDate(joinDate);

        return repository.insert(doctor);
    }

    public Doctor updateDoctor(String id, String name, Gender gender, LocalDate birthYear, LocalDate joinDate) {
        Doctor doctor = new Doctor();
        doctor.setName(name);
        doctor.setGender(gender);
        doctor.setBirthYear(birthYear);
        doctor.setJoinDate(joinDate);

        return repository.update(id, doctor);
    }

    public Doctor delete(String id) {

        return repository.delete(id);
    }

    public List<Doctor> listDoctorByDepartment(Long departmentId) {

        return repository.select(departmentId);
    }
}
