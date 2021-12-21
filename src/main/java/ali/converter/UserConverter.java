package ali.converter;

import ali.dto.UserDto;
import ali.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User convertUserDtoToUser(UserDto userDto);

    UserDto convertUserToUserDto(User user);

    List<UserDto> convertUserListToUserDtoList(List<User> user);

    List<User> convertUserDtoListToUserList(List<UserDto> userList);
}
