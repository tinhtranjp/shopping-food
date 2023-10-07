package jp.furucrm.shopping.service.Imp;

import jp.furucrm.shopping.dto.UserDTO;
import jp.furucrm.shopping.payload.request.SignUpRequest;

import java.util.List;

public interface LoginServiceImp {
    List<UserDTO> getAllUser();

    boolean checkLogin(String username, String password);
    boolean addUser(SignUpRequest signUpRequest);
}
