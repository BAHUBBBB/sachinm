import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
    private String patientName;
    private String doctorName;
    private LocalDateTime appointmentTime;

    public Appointment(String patientName, String doctorName, LocalDateTime time) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.appointmentTime = time;
    }

    public void displayDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("\n--- Appointment Confirmation ---");
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Doctor Name:  " + this.doctorName);
        System.out.println("Time & Date:  " + this.appointmentTime.format(formatter));
        System.out.println("Status:       Confirmed");
    }

    public static void main(String[] args) {
        System.out.println("Hospital Appointment Booking System");
        
        LocalDateTime timeSlot = LocalDateTime.of(2026, 10, 15, 14, 30);
        Appointment newAppointment = new Appointment("Alice Smith", "Dr. John Doe", timeSlot);
        
        newAppointment.displayDetails();
    }
}
