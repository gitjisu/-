package com.dool.characterservice.db.repository;

import com.dool.characterservice.db.domain.CharacterMission;
import com.dool.characterservice.db.domain.UserCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface CharacterMissionRepository extends JpaRepository<CharacterMission, Long> {
    CharacterMission findTopByUserCharacterAndIsClearTrueOrderByCreatedDateDesc(UserCharacter user_character_id);
    Long countAllByUserCharacterAndCreatedDateLessThanAndIsClearTrue(UserCharacter user_character_id, LocalDateTime date);
}
