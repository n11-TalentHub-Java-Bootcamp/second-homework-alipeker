package ali.entityService;

import ali.converter.UserConverter;
import ali.dao.UserDao;
import ali.dto.UserDto;
import ali.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserConverter converter;

    public List<UserDto> findAll(){
        return converter.convertUserListToUserDtoList(userDao.findAll());
    }

    public UserDto findUserByUserName(String username){
        return converter.convertUserToUserDto(userDao.findUserByUserName(username));
    }

    public UserDto findUserByPhoneNumber(String phoneNumber){
        return converter.convertUserToUserDto(userDao.findUserByPhoneNumber(phoneNumber));
    }

    public UserDto saveUser(UserDto user){
        return converter.convertUserToUserDto(userDao.save(converter.convertUserDtoToUser(user)));
    }

    public UserDto updateUser(UserDto user){
        return converter.convertUserToUserDto(userDao.save(converter.convertUserDtoToUser(user)));
    }

    public String deleteUser(UserDto user) throws Exception {
        User persistUserFindByUserName = userDao.findUserByUserName(user.getUsername());
        User persistUserFindByPhoneNumber = userDao.findUserByPhoneNumber(user.getPhoneNumber());

        if(persistUserFindByUserName.equals(persistUserFindByPhoneNumber)) {
            userDao.deleteById(persistUserFindByUserName.getId());
            return "successfully removed";
        }
        String errorMessage = user.getUsername()+ " kullanıcı adı ile " + user.getPhoneNumber() + " telefonu bilgileri uyuşmamaktadır.";
        return errorMessage;
    }

}
