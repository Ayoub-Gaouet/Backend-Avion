package com.ayoub.avions.service;
import java.util.List;

import com.ayoub.avions.entities.Avions;
import com.ayoub.avions.entities.Company;
import com.ayoub.avions.repos.AvionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionsServiceImpl implements AvionsService {
    @Autowired
    AvionsRepository avionsRepository;
    @Override
    public Avions saveAvions(Avions a) {
        return avionsRepository.save(a);
    }

    @Override
    public Avions updateAvions(Avions a) {
        return avionsRepository.save(a);
    }

    @Override
    public void deleteAvions(Avions a) {
        avionsRepository.delete(a);
    }

    @Override
    public void deleteAvionsById(Long id) {
        avionsRepository.deleteById(id);
    }

    @Override
    public Avions getAvions(Long id) {
        return avionsRepository.findById(id).get();
    }

    @Override
    public List<Avions> getAllAvions() {
        return avionsRepository.findAll();
    }
    @Override
    public List<Avions> findByNomAvions(String nom) {
        return avionsRepository.findByNomAvions(nom);
    }
    @Override
    public List<Avions> findByNomAvionsContains(String nom) {
        return  avionsRepository.findByNomAvionsContains(nom);
    }
    @Override
    public List<Avions> findByNomPrix(String nom, Double prix) {
        return  avionsRepository.findByNomPrix(nom, prix);
    }
    @Override
    public List<Avions> findByCompany(Company company) {
        return  avionsRepository.findByCompany(company);
    }
    @Override
    public List<Avions> findByCompanyIdCom(Long id) {
        return  avionsRepository.findByCompanyIdCom(id);
    }
    @Override
    public List<Avions> findByOrderByNomAvionsAsc() {
        return  avionsRepository.findByOrderByNomAvionsAsc();
    }
    @Override
    public List<Avions> trierAvionsNomsPrix() {
        return  avionsRepository.trierAvionsNomsPrix();
    }
}

