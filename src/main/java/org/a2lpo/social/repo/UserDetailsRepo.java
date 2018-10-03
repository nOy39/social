package org.a2lpo.social.repo;

import org.a2lpo.social.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
