package ali.converter;

import ali.dto.UserDto;
import ali.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-21T19:50:53+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class UserConverterImpl implements UserConverter {

    @Override
    public User convertUserDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setName( userDto.getName() );
        user.setLastName( userDto.getLastName() );
        user.setEmail( userDto.getEmail() );
        user.setPhoneNumber( userDto.getPhoneNumber() );

        return user;
    }

    @Override
    public UserDto convertUserToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setName( user.getName() );
        userDto.setLastName( user.getLastName() );
        userDto.setEmail( user.getEmail() );
        userDto.setPhoneNumber( user.getPhoneNumber() );

        return userDto;
    }

    @Override
    public List<UserDto> convertUserListToUserDtoList(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( user.size() );
        for ( User user1 : user ) {
            list.add( convertUserToUserDto( user1 ) );
        }

        return list;
    }

    @Override
    public List<User> convertUserDtoListToUserList(List<UserDto> userList) {
        if ( userList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userList.size() );
        for ( UserDto userDto : userList ) {
            list.add( convertUserDtoToUser( userDto ) );
        }

        return list;
    }
}
