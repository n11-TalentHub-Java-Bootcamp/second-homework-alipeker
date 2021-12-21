package ali.dao;

import ali.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    @Query(value = "select user from Users user where user.username = :username", nativeQuery = true)
    User findUserByUserName(String username);

    @Query(value = "select user from Users user where user.phoneNumber = :phoneNumber", nativeQuery = true)
    User findUserByPhoneNumber(String phoneNumber);
}
