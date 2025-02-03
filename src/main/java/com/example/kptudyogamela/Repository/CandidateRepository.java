package com.example.kptudyogamela.Repository;

import com.example.kptudyogamela.Model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
    // You can add custom queries here if needed
}
