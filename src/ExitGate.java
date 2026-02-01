public class ExitGate implements Gate{

    public void makePayment(Ticket ticket){
        long totalTime = System.currentTimeMillis() - ticket.getEntryTime();
        double amount = ticket.getVehicle().getCharge()*(totalTime/1000);
        System.out.println("Making Payment");
    }

    public void freeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.setFree(true);
    }
}
