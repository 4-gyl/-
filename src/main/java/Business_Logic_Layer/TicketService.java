package Business_Logic_Layer;

import Data_Access_Layer.TicketDAO;
import Entity.Ticket;
import Entity.User;

public class TicketService {
    private TicketDAO ticketDAO;

    public TicketService() {
        ticketDAO = new TicketDAO();
    }

    public boolean buyTicket(User user, Ticket ticket) {
        // 实现购买票的逻辑
        return ticketDAO.saveTicket(ticket);
    }

    public boolean refundTicket(User user, Ticket ticket) {
        // 实现退票的逻辑
        return ticketDAO.deleteTicket(ticket);
    }
}
