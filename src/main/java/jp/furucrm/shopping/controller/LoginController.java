package jp.furucrm.shopping.controller;

import jp.furucrm.shopping.payload.ResponseData;
import jp.furucrm.shopping.payload.request.SignUpRequest;
import jp.furucrm.shopping.service.Imp.LoginServiceImp;
import jp.furucrm.shopping.utils.JwtUtilsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginServiceImp loginServiceImp;

    @Autowired
    JwtUtilsHelper jwtUtilsHelper;

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String username, @RequestParam String password) {
        ResponseData responseData = new ResponseData();

        if (loginServiceImp.checkLogin(username, password)) {
            String token = jwtUtilsHelper.generateToken(username);
            responseData.setData(token);

        } else {
            responseData.setSucces(false);
        }
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpRequest signUpRequest) {

        ResponseData responseData = new ResponseData();
        responseData.setData(loginServiceImp.addUser(signUpRequest));

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @GetMapping("get-all-user")
    public ResponseEntity<?> getAllUser() {
        ResponseData responseData = new ResponseData();
        responseData.setData(loginServiceImp.getAllUser());
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }


}
