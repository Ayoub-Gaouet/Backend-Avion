package com.ayoub.avions.service;
import java.util.List;

import com.ayoub.avions.entities.Avions;
import com.ayoub.avions.entities.Company;

public interface AvionsService {
    Avions saveAvions(Avions a);
    Avions updateAvions(Avions a);
    void deleteAvions(Avions a);
    void deleteAvionsById(Long id);
    Avions getAvions(Long id);
    List<Avions> getAllAvions();
    List<Avions> findByNomAvions(String nom);
    List<Avions> findByNomAvionsContains(String nom);
    List<Avions> findByNomPrix (String nom, Double prix);
    List<Avions> findByCompany (Company company);
    List<Avions> findByCompanyIdCom(Long id);
    List<Avions> findByOrderByNomAvionsAsc();
    List<Avions> trierAvionsNomsPrix();
}
