package exceptions.gymApp;

import exceptions.gymApp.domain.Member;
import exceptions.gymApp.exception.GymAccessDeniedException;
import exceptions.gymApp.exception.GymClosedException;
import exceptions.gymApp.service.GymService;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

        GymService service = new GymService(100);

        Member member = new Member();
        Object nonMember = new Object();

        try {
            service.bookSeatAtClass(member);
            service.bookSeatAtClass(nonMember);
        } catch (Exception e) {
            System.out.println("An exception was thrown: " + e.getMessage());
        }

        System.out.println(service.getBookedSeats());
    }
}
