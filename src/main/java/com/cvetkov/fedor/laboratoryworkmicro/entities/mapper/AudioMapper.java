package com.cvetkov.fedor.laboratoryworkmicro.entities.mapper;

import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.request.AudioRequest;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.response.AudioResponse;
import com.cvetkov.fedor.laboratoryworkmicro.entities.dto.update.AudioUpdate;
import com.cvetkov.fedor.laboratoryworkmicro.entities.model.Audio;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AudioMapper {

    private final ModelMapper mapper;

    @PostConstruct
    public void setupMapper() {
        mapper.createTypeMap(Audio.class, AudioResponse.class)
                .addMappings(m -> m.skip(AudioResponse::setAuthor)).setPostConverter(toAudioResponseConverter());
    }

    private Converter<Audio, AudioResponse> toAudioResponseConverter() {
        return context -> {
            Audio source = context.getSource();
            AudioResponse destination = context.getDestination();
            destination.setAuthor(source.getAuthorId());
            return context.getDestination();
        };
    }

    public AudioResponse audioToAudioResponse(Audio audio) {
        return mapper.map(audio, AudioResponse.class);
    }

    public Audio audioRequestToAudio(AudioRequest request) {
        return mapper.map(request, Audio.class);
    }

    public Audio audioUpdateToAudio(AudioUpdate update) {
        return mapper.map(update, Audio.class);
    }

    public List<AudioResponse> audioToAudioResponseList(List<Audio> audio) {
        return audio
                .stream()
                .map(this::audioToAudioResponse)
                .collect(Collectors.toList());
    }

    public Page<AudioResponse> audioToAudioResponsePage(Page<Audio> audioPage) {
        return audioPage
                .map(this::audioToAudioResponse);
    }
}
