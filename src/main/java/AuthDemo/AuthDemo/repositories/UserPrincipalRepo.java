package AuthDemo.AuthDemo.repositories;
import AuthDemo.AuthDemo.models.UserPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserPrincipalRepo extends JpaRepository<UserPrincipal, Long> {
    Optional<UserPrincipal> findByUsername(String username);

    //List<UserPrincipal> findByCredentialsNonExpiredIsFalse();
}