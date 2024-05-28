package jo.seongju.hospital.service;

import jo.seongju.hospital.domain.Appointment;
import jo.seongju.hospital.repository.AppointmentRepository;

import java.time.LocalDateTime;

public class AppointmentService {

    private DoctorService doctorService;
    private PatientService patientService;
    private AppointmentRepository repository = new AppointmentRepository();

    public AppointmentService(DoctorService doctorService, PatientService patientService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    public Appointment add(String doctorId, Integer patientId, LocalDateTime appointTime) {

        return null;
    }
}
