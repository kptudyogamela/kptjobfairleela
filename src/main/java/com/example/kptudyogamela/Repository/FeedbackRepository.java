package com.example.kptudyogamela.Repository;


import com.example.kptudyogamela.Model.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}
