package jp.furucrm.shopping.service;

import jp.furucrm.shopping.dto.UserDTO;
import jp.furucrm.shopping.entity.Roles;
import jp.furucrm.shopping.entity.Users;
import jp.furucrm.shopping.payload.request.SignUpRequest;
import jp.furucrm.shopping.repository.UserRepository;
import jp.furucrm.shopping.service.Imp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService implements LoginServiceImp {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    public List<UserDTO> getAllUser() {
        List<Users> listUser = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (Users user: listUser) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setUserName(user.getUserName());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullName(user.getFullName());
            userDTO.setCreateDate(user.getCreateDate());


            userDTOList.add(userDTO);
        }

        return userDTOList;
    }

    @Override
    public boolean checkLogin(String username, String password) {

        Users user = userRepository.findByUserName(username);

        return passwordEncoder.matches(password, user.getPassword());
    }

    @Override
    public boolean addUser(SignUpRequest signUpRequest) {
        Roles roles = new Roles();
        roles.setId(signUpRequest.getRoleId());

        Users user = new Users();
        user.setUserName(signUpRequest.getUserName());
        user.setPassword(signUpRequest.getPassword());
        user.setFullName(signUpRequest.getFullName());
        user.setKatakana(signUpRequest.getKatakana());
        user.setPhone(signUpRequest.getPhone());
        user.setEmail(signUpRequest.getEmail());
        user.setFax(signUpRequest.getFax());
        user.setNamSinh(signUpRequest.getNamSinh());
        user.setGioiTinh(signUpRequest.getGioiTinh());
        user.setChapNhanTin(signUpRequest.getChapNhanTin());
        user.setRoles(roles);

        try{
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
