package com.demohotel.hotelapi.image;

import com.demohotel.hotelapi.image.command.CreateImage;
import com.demohotel.hotelapi.image.command.FindImage;
import com.demohotel.hotelapi.image.command.RemoveImage;
import com.demohotel.hotelapi.image.command.UpdateImage;
import com.demohotel.hotelapi.image.model.Image;
import com.demohotel.hotelapi.image.port.ImagePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ImageFacade {

    private final ImagePort imagePort;

    public String create(CreateImage createImage) {
        return imagePort.create(createImage);
    }

    public String update(UpdateImage updateImage) {
        return imagePort.update(updateImage);
    }

    public String remove(RemoveImage removeImage) {
        return imagePort.remove(removeImage);
    }

    public Image find(FindImage findImage) {
        return imagePort.find(findImage);
    }
}
