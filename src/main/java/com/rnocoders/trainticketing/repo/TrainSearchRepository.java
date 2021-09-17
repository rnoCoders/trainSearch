package com.rnocoders.trainticketing.repo;

import com.rnocoders.trainticketing.entity.TrainSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainSearchRepository extends JpaRepository<TrainSearch, String> {

    @Query(value = "SELECT * FROM train_data where train_no = ?1", nativeQuery = true)
    List<TrainSearch> findByTrain_no(String uniqueTrainNum);
}
