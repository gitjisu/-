package com.dool.characterservice.api.service;

import com.dool.characterservice.api.response.MissionResponseDto;
import com.dool.characterservice.db.domain.Mission;
import com.dool.characterservice.db.repository.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MissionServiceImpl implements MissionService{
    private final MissionRepository missionRepository;

    @Override
    public MissionResponseDto missionDetail(Long id) {
        Mission mission = missionRepository.findById(id).get();

        return MissionResponseDto.builder()
                .id(mission.getId())
                .title(mission.getTitle())
                .content(mission.getContent())
                .type(mission.getType())
                .img(mission.getImg())
                .build();
    }

    @Override
    public List<MissionResponseDto> getMission() {
        List<Mission> missionList = missionRepository.findAll();
        List<MissionResponseDto> missionResponseDtoList = new ArrayList<>();

        missionList.forEach(v -> {
            missionResponseDtoList.add(MissionResponseDto.builder()
                            .id(v.getId())
                            .img(v.getImg())
                            .content(v.getContent())
                            .title(v.getTitle())
                            .type(v.getType())
                    .build());
        });
        return missionResponseDtoList;
    }
}
