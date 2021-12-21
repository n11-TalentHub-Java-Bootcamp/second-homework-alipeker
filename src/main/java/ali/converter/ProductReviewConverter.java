package ali.converter;

import ali.dto.UserDto;
import ali.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductReviewConverter {
    /*
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User convertUserDtoToUser(ProductUserReviewDetailDto userDto);

    ProductUserReviewDetailDto convertUserToUserDto(User user);

    List<ProductUserReviewDetailDto> convertUserListToUserDtoList(List<User> user);

    List<User> convertUserDtoListToUserList(List<ProductUserReviewDetailDto> userList);
     */
}
