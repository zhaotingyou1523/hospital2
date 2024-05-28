package jo.seongju.hospital.domain;

import java.time.LocalDateTime;

public class Appointment {

    private Long id;

    private Patient patient;            // 患者

    private Doctor doctor;              // 医生

    private LocalDateTime appointTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(LocalDateTime appointTime) {
        this.appointTime = appointTime;
    }
}
