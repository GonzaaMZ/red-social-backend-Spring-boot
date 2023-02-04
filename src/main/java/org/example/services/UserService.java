package org.example.services;

import org.example.dto.ImageDto;
import org.example.dto.MessageDto;
import org.example.dto.ProfileDto;
import org.example.dto.UserSummaryDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class UserService {

    public ProfileDto getProfile(Long userId) {
        return new ProfileDto(new UserSummaryDto(1L, "Sergio", "Lema"),
                Arrays.asList(new UserSummaryDto(2L, "John", "Doe")),
                Arrays.asList(new MessageDto(1L, "My message")),
                Arrays.asList(new ImageDto(1L, "Title", null)));
    }

    public void addFriend(Long friendId) {
        return;
    }

    public List<UserSummaryDto> searchUsers(String term) {
        return Arrays.asList(new UserSummaryDto(1L, "Sergio", "Lema"),
                new UserSummaryDto(2L, "John", "Doe"));
    }
}
