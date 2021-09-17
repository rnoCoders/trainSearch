package com.rnocoders.trainticketing.service;

import com.rnocoders.trainticketing.entity.TrainSearch;
import com.rnocoders.trainticketing.entity.TrainSearchCriteria;
import com.rnocoders.trainticketing.repo.TrainSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainSearchService {
    @Autowired
    private TrainSearchRepository repo;

    public List<TrainSearch> trainSearchList(TrainSearchCriteria searchCriteria){

        //Fetches list of all train data from DB.
        List<TrainSearch> allTrainsList;
        allTrainsList = repo.findAll();

        List<TrainSearch> trainDetailSingle;
        List<TrainSearch> trainDetailAll = new ArrayList<>();
        List<String> trainNo = new ArrayList<>();

        for (TrainSearch alltrainslist : allTrainsList) {
           if ( alltrainslist.getStation_name().contains(searchCriteria.getFrom()) ||
                alltrainslist.getStation_name().contains(searchCriteria.getTo())){
                trainDetailSingle = repo.findByTrain_no(alltrainslist.getTrain_no());
                for (int j = 0; j < trainDetailSingle.size(); j++) {
                    if (trainDetailSingle.get(j).getStation_name().contains(searchCriteria.getFrom())) {
                        for (TrainSearch traindetailsingle : trainDetailSingle) {
                            if (traindetailsingle.getStation_name().contains(searchCriteria.getTo())) {
                                trainNo.add(traindetailsingle.getTrain_no());
                            }
                        }
                    }

                }

            }
        }

        ArrayList<String> distinctTrainNums = (ArrayList<String>) trainNo.stream().distinct().collect(Collectors.toList());
        for (String distincttrainnums : distinctTrainNums) {
            trainDetailSingle = repo.findByTrain_no((String) distincttrainnums);
            trainDetailAll.addAll(trainDetailSingle);
        }
        return trainDetailAll;
    }

}

