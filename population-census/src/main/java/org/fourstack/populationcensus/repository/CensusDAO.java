package org.fourstack.populationcensus.repository;

import org.fourstack.populationcensus.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CensusDAO extends JpaRepository<Person, Long>{

}
