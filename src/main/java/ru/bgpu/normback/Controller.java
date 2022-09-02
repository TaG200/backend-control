package ru.bgpu.normback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    NormRepo db;

    @RequestMapping("/neNorm")
    public Data postData(@RequestBody Data obj){
        Data saved = db.save(obj);
        System.out.println(saved);
        return saved;
    }
    @RequestMapping("/getD")
    public Data getData(){
        return db.findById(db.count()).get();
    }

}
