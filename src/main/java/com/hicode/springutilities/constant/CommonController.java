package com.hicode.springutilities.constant;

import com.hicode.springutilities.response.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 *
 * @param <REQBODY> Request Body
 * @param <ID>  ID
  */
public interface CommonController<REQBODY,ID> {

    @GetMapping("/list")
    public ResponseEntity<?> getList();

    @GetMapping("/get-data/{id}")
    public ResponseEntity<?> getOne(ID id);

    @PostMapping("/save")
    public ResponseEntity<?> save(REQBODY BODY);
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?>  delete(ID id);


}
