package com.fleetmsv2.helpdesk.repositories;

import com.fleetmsv2.helpdesk.models.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {

}
