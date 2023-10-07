package jp.furucrm.shopping.controller;

import jp.furucrm.shopping.payload.ResponseData;
import jp.furucrm.shopping.service.Imp.FileServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    FileServiceImp fileServiceImp;

    @PostMapping("")
    public ResponseEntity<?> createRestaurant(@RequestParam MultipartFile file) {
        ResponseData responseData = new ResponseData();
        responseData.setData(fileServiceImp.saveFile(file));

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @GetMapping("/file/{fileName:.+}")
    public ResponseEntity<?> getFileRestaurant(@PathVariable String fileName) {

        Resource resource = fileServiceImp.loadFile(fileName);

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"").body(resource);

    }

}
