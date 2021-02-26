package com.demohotel.hotelapi.translation.port;

import com.demohotel.hotelapi.common.Port;
import com.demohotel.hotelapi.translation.command.CreateTranslation;
import com.demohotel.hotelapi.translation.command.FindTranslation;
import com.demohotel.hotelapi.translation.command.RemoveTranslation;
import com.demohotel.hotelapi.translation.command.UpdateTranslation;
import com.demohotel.hotelapi.translation.model.Translation;

@Port
public interface TranslationPort {

    Long create(CreateTranslation createTranslation);

    Long update(UpdateTranslation updateTranslation);

    Long remove(RemoveTranslation removeTranslation);

    Translation find(FindTranslation findTranslation);
}
