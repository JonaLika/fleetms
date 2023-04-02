package com.fleetmsv2.parameters.repositories;

import com.fleetmsv2.parameters.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
