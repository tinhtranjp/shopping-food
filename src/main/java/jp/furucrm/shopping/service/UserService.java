package jp.furucrm.shopping.service;

import jp.furucrm.shopping.dto.UserDTO;
import jp.furucrm.shopping.entity.Users;
import jp.furucrm.shopping.repository.UserRepository;
import jp.furucrm.shopping.service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceImp {

    @Autowired
    UserRepository userRepository;
    @Override
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
}
