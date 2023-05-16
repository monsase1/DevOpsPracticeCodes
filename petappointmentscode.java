import java.util.*;

class PetAppointment {
    private String petName;
    private Date appointmentDate;

    public PetAppointment(String petName, Date appointmentDate) {
        this.petName = petName;
        this.appointmentDate = appointmentDate;
    }

    public String getPetName() {
        return petName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }
}

class PetAppointmentScheduler {
    private List<PetAppointment> appointments;

    public PetAppointmentScheduler() {
        appointments = new ArrayList<>();
    }

    public void scheduleAppointment(String petName, Date appointmentDate) {
        PetAppointment newAppointment = new PetAppointment(petName, appointmentDate);
        appointments.add(newAppointment);
        System.out.println("Appointment scheduled for " + petName + " on " + appointmentDate);
    }

    public List<PetAppointment> getAppointments() {
        return appointments;
    }
}

public class Main {
    public static void main(String[] args) {
        PetAppointmentScheduler scheduler = new PetAppointmentScheduler();

        // Schedule appointments
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.MAY, 16, 10, 0); // Example appointment date and time
        scheduler.scheduleAppointment("Fluffy", calendar.getTime());

        calendar.set(2023, Calendar.MAY, 17, 15, 30); // Example appointment date and time
        scheduler.scheduleAppointment("Buddy", calendar.getTime());

        // Retrieve appointments
        List<PetAppointment> appointments = scheduler.getAppointments();
        System.out.println("Scheduled Appointments:");
        for (PetAppointment appointment : appointments) {
            System.out.println("Pet: " + appointment.getPetName() + ", Appointment Date: " + appointment.getAppointmentDate());
        }
    }
}

















