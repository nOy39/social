package org.a2lpo.social.repo;

import org.a2lpo.social.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
