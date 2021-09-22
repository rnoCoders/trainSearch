package com.rnocoders.trainticketing.controller;

import com.rnocoders.trainticketing.entity.TrainSearch;
import com.rnocoders.trainticketing.entity.TrainSearchCriteria;
import com.rnocoders.trainticketing.repo.TrainSearchRepository;
import com.rnocoders.trainticketing.service.TrainSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class TrainSearchController {
    @Autowired
    private TrainSearchService serv;
    @Autowired
    private TrainSearchRepository repo;

    @PostMapping("/trainSearch")
    public List<TrainSearch> trainSearchList(TrainSearchCriteria searchCriteria){
        return serv.trainSearchList(searchCriteria);
    }

    @PostMapping("/getTrainNums")
    public ArrayList<String> getTrainNumbers(TrainSearchCriteria searchCriteria){
        List<TrainSearch> trainsList = trainSearchList(searchCriteria);
        List<String> trainNumbers = new ArrayList<>();
        for (TrainSearch trainslist : trainsList) {
            trainNumbers.add(trainslist.getTrain_no());
        }

        return (ArrayList<String>) trainNumbers.stream().distinct().collect(Collectors.toList());
    }

    @GetMapping("/stationNames")
    public List<String> getStationNames(){
        return repo.stationNames();
    }

}