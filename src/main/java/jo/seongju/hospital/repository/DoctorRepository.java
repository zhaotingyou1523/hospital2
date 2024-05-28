package jo.seongju.hospital.repository;

import jo.seongju.hospital.domain.Doctor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DoctorRepository {

    private Map<String, Doctor> doctorMap = new HashMap<>();

    public Doctor insert(Doctor doctor) {
        doctorMap.put(doctor.getId(), doctor);
        return doctor;
    }

    public Doctor update(String id, Doctor doctor) {
        Doctor doc = doctorMap.get(id);
        doc.setName(doctor.getName());
        doc.setGender(doctor.getGender());
        doc.setBirthYear(doctor.getBirthYear());
        return doc;
    }

    public Doctor delete(String id) {

        return doctorMap.remove(id);
    }

    public List<Doctor> select(Long departmentId) {

        return doctorMap.values().stream().filter(doctor -> departmentId.equals(doctor.getDepartment().getId())).collect(Collectors.toList());
    }
}
