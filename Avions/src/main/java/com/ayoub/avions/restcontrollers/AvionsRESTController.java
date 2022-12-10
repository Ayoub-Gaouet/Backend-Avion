package com.ayoub.avions.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ayoub.avions.entities.Avions;
import com.ayoub.avions.service.AvionsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class AvionsRESTController {
    @Autowired
    AvionsService avionsService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Avions> getAllAvions() {
        return avionsService.getAllAvions();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Avions getAvionsById(@PathVariable("id") Long id) {
    return avionsService.getAvions(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Avions avionsService(@RequestBody Avions avions) {
    return avionsService.saveAvions(avions);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Avions updateAvions(@RequestBody Avions avions) {
    return avionsService.updateAvions(avions);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteAvions(@PathVariable("id") Long id)
    {
    	avionsService.deleteAvionsById(id);
    }
    @RequestMapping(value="/avcom/{idCom}",method = RequestMethod.GET)
    public List<Avions> getAvionsByCatId(@PathVariable("idCom") Long idCom) {
    return avionsService.findByCompanyIdCom(idCom);
    }
}