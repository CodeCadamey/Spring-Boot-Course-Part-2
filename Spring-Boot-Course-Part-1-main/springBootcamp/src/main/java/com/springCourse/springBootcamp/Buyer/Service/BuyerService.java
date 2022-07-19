package com.springCourse.springBootcamp.Buyer.Service;

import com.springCourse.springBootcamp.Buyer.Dao.BuyerDao;
import com.springCourse.springBootcamp.Buyer.Entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    private BuyerDao buyerDao;

    public Buyer findAllById(Long Id) {
        return buyerDao.findAllById(Id);
    }

    public List<Buyer> findByAccessStatus(Boolean accessStatus) {
        return buyerDao.findByIsBanned(accessStatus);
    }
}
