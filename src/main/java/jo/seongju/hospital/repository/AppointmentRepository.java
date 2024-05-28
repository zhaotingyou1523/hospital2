package jo.seongju.hospital.repository;

import jo.seongju.hospital.domain.Appointment;
import jo.seongju.hospital.domain.Department;
import jo.seongju.hospital.domain.Doctor;
import jo.seongju.hospital.domain.Patient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AppointmentRepository {

    private long id = 1L;// 线程安全

    private Map<Long, Appointment> appointmentMap = new HashMap<>();

    public synchronized Appointment insert(Doctor doctor, Patient patient, LocalDateTime appointTime) {

        long appointmentId = id++;
        Appointment appointment = new Appointment();
        appointment.setId(appointmentId);
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        appointment.setAppointTime(appointTime);

        appointmentMap.put(appointment.getId(), appointment);

        return appointment;
    }

    /*
    public List<Appointment> select(String doctorId, LocalDate from, LocalDate to) {
        appointmentMap.values().stream().filter(new Predicate<Appointment>() {
            @Override
            public boolean test(Appointment appointment) {
                String docId = appointment.getDoctor().getId();
                return doctorId.equals(docId);
            }
        })
    }*/

}
