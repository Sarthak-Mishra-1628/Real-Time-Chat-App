package com.chat.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chat.app.Entity.ChatMessage;

public interface Repository extends JpaRepository<ChatMessage, Long> {
}
