package com.demohotel.hotelapi.translation;

import com.demohotel.hotelapi.translation.command.CreateTranslation;
import com.demohotel.hotelapi.translation.command.FindTranslation;
import com.demohotel.hotelapi.translation.command.RemoveTranslation;
import com.demohotel.hotelapi.translation.command.UpdateTranslation;
import com.demohotel.hotelapi.translation.model.Translation;
import com.demohotel.hotelapi.translation.port.TranslationPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TranslationFacade {

    private final TranslationPort translationPort;

    public Long create(CreateTranslation createTranslation) {
        return translationPort.create(createTranslation);
    }

    public Long update(UpdateTranslation updateTranslation) {
        return translationPort.update(updateTranslation);
    }

    public Long remove(RemoveTranslation removeTranslation) {
        return translationPort.remove(removeTranslation);
    }

    public Translation find(FindTranslation findTranslation) {
        return translationPort.find(findTranslation);
    }
}
